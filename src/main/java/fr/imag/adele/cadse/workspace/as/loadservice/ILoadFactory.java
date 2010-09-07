/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Copyright (C) 2006-2010 Adele Team/LIG/Grenoble University, France
 */
package fr.imag.adele.cadse.workspace.as.loadservice;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.fede.workspace.as.initmodel.jaxb.CAttType;
import fr.imag.adele.fede.workspace.as.initmodel.jaxb.CItemType;
import fr.imag.adele.fede.workspace.as.initmodel.jaxb.CValuesType;
import fr.imag.adele.fede.workspace.as.initmodel.IInitModel;

/**
 * 
 */
public interface ILoadFactory {

	CAttType convertToCAttType(IInitModel initEngine, IAttributeType<?> attributeType);

	CAttType convertCadsegToCAttType(IInitModel initEngine, Item attributeType);

	IAttributeType<?> convertToAttributeType(IInitModel initEngine, Item parent, String cadseName,
			CAttType attDefinition, ItemType attDefinitionType) throws CadseException;

	IAttributeType<?> convertToAttributeType(IInitModel initEngine, CValuesType attType);

	CItemType convertToCItemType(IInitModel initEngine, ItemType itemType);

	CItemType convertCadsegToCItemType(IInitModel initEngine, Item itemType);

	ItemType convertToItemType(IInitModel initEngine, CItemType itemType);

	Object convertToCValue(IInitModel initEngine, CValuesType value, IAttributeType<?> type);
}
