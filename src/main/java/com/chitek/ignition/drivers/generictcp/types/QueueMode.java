/*******************************************************************************
 * Copyright 2012-2013 C. Hiesserich
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.chitek.ignition.drivers.generictcp.types;

import java.util.Arrays;
import java.util.List;

public enum QueueMode {
	NONE, HANDSHAKE, DELAYED;
	
	/**
	 * List with the options to use in a DropDownChoice
	 * 
	 * @return
	 */
	public static List<QueueMode> getOptions() {
		return Arrays.asList(values());
	}
}
