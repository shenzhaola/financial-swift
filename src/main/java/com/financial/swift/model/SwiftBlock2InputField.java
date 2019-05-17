/*
 * Copyright 2006-2018 Prowide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.financial.swift.model;

/**
 * Full qualified names for attributes in block 2 input.
 * 
 * @author sebastian@prowidesoftware.com
 * @since 7.7
 */
public enum SwiftBlock2InputField {
	/*
	 * common fields to block 2
	 */
	MessageType,
	MessagePriority,
	/*
	 * specific fields of input block
	 */
	ReceiverAddress,
	DeliveryMonitoring,
	ObsolescencePeriod;
}