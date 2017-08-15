package com.yunus.proxy;

import com.xiaoleilu.hutool.io.FileUtil;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


/**
 * 模拟jdk动态代理
 * @author yunus
 *
 */
public class ProxyType2 {

	public static Object newProxyInstance(Class inf,InvocationHandler h) throws Exception{
		String rt = "\t\n";
		String methods = "";
		for(Method method : inf.getMethods()){
			methods += "@Override"+rt+
					"public void "+method.getName()+"() {"+rt+
					"try{"+rt+
					"Method md=" + inf.getName()+".class.getMethod(\""+method.getName()+"\");"+rt+
					"h.invoke(this,md);"+rt+
					"}catch(Exception e){}"+rt+
					"}";
		}
		String str = "package com.yunus.designmode.proxy;"+rt+
				"import com.yunus.designmode.proxy.InvocationHandler;"+rt+
				"import java.lang.reflect.Method;"+rt+
				"public class $Proxy0 implements "+inf.getName()+" {"+rt+
				"private InvocationHandler h;"+rt+
				"public $Proxy0(InvocationHandler h) {"+rt+
				" this.h = h;"+rt+
				"}"+rt+
				methods+rt+
				"}";
		// 产生代理类的java文件
		String fileName = System.getProperty("user.dir")+"/bin/com/yunus/designmode/proxy/$Proxy0.java";
		File file = new File(fileName);
		FileUtil.writeString(str, file, "utf-8");
		// 编译
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null,null,null);
		// 获取文件
		Iterable<? extends JavaFileObject> units = fileManager.getJavaFileObjects(fileName);
		// 编译任务
		CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);
		task.call();
		fileManager.close();
		// load 到内存中
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		Class<?> c = classLoader.loadClass("com.yunus.designmode.proxy.$Proxy0");
		// 
		Constructor<?> constructor = c.getConstructor(InvocationHandler.class);
		return constructor.newInstance(h);
	}

}
