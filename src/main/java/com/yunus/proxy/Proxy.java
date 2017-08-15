package com.yunus.proxy;

import com.xiaoleilu.hutool.io.FileUtil;

import javax.tools.JavaCompiler;
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
public class Proxy {

	public static Object newProxyInstance(Class inf) throws Exception{
		String rt = "\t\n";
		String methods = "";
		for(Method method : inf.getMethods()){
			methods += "@Override"+rt+
					"public void "+method.getName()+"() {"+rt+
					"	long startTime = System.currentTimeMillis();"+rt+
					"	b."+method.getName()+"();"+rt+
					"	long endTime = System.currentTimeMillis();"+rt+
					"	System.out.println(\"汽车行驶时间为：\"+(endTime-startTime));"+rt+
					"}";
		}
		String str = "package com.yunus.designmode.proxy;"+rt+
				"public class $Proxy0 implements "+inf.getName()+" {"+rt+
				"private "+inf.getName()+" b;"+rt+
				"public $Proxy0("+inf.getName()+" b) {"+rt+
				" this.b = b;"+rt+
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
		JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);
		task.call();
		fileManager.close();
		// load 到内存中
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		Class<?> c = classLoader.loadClass("com.yunus.designmode.proxy.$Proxy0");
		//
		Constructor<?> constructor = c.getConstructor(inf);
		return constructor.newInstance(new Car());
	}

}