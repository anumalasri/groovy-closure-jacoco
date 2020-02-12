package com.groovy.closure.test

import com.groovy.closure.GroovyClosureMain

import spock.lang.Specification

class GroovyClosureTest extends Specification{

	def "Test Closure1" () {
		setup:
		GroovyClosureMain mainCls =  new GroovyClosureMain()
		String name = "Name"
		
		when:
		String response = mainCls.method1(name)

		then:
		assert response != null
	}
	
	 
}
