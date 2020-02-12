package com.groovy.closure

import java.util.concurrent.CompletableFuture

public class GroovyClosureMain {
	
	def String method1(def name) {
		
		def name1 = 'Hello ' + name 
		def text =  ' - Closure Test'
		 
		CompletableFuture<Object> future = callAsync(name1, text)
		
		return future.get()
	}
	
	def CompletableFuture<Object> callAsync(arg1, arg2) {
		return CompletableFuture.supplyAsync({ return arg1 + ' ' + arg2  })
		
	}
	 
 
}
