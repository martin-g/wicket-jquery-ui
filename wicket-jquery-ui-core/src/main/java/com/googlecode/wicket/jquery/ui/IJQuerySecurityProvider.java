/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.wicket.jquery.ui;

/**
 * Specifies that the implementing class is able to provide a control on user roles
 * 
 * @author Sebastien Briquet - sebastien@7thweb.net
 *
 */
public interface IJQuerySecurityProvider
{
	/**
	 * Indicated whether provided roles matches user roles.<br/>
	 * Implementation is free to define the strategy. For instance, has the user one of the roles or should him have all role?
	 * @param roles the roles to check
	 * @return the strategy result
	 */
	boolean hasRole(String... roles);
}
