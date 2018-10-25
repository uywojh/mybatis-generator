/*
 *  Copyright 2009 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mybatis.generator.codegen.mybatis3.javamapper.elements;

import java.util.Set;
import java.util.TreeSet;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;

/**
 * 
 * @author Jeff Butler
 * 
 */
public class SelectScalarByExampleWithoutBLOBsMethodGenerator extends
        AbstractJavaMapperMethodGenerator {

    public SelectScalarByExampleWithoutBLOBsMethodGenerator() {
        super();
    }

    @Override
    public void addInterfaceElements(Interface interfaze) {
        Set<FullyQualifiedJavaType> importedTypes = new TreeSet<FullyQualifiedJavaType>();
        FullyQualifiedJavaType type = new FullyQualifiedJavaType(
                introspectedTable.getExampleType());
        importedTypes.add(type);
        importedTypes.add(FullyQualifiedJavaType.getNewListInstance());

        Method method = new Method();
        method.setComment("根据条件返回唯一用户（不包括大文本字段）");
        method.setVisibility(JavaVisibility.PUBLIC);

//        FullyQualifiedJavaType returnType = FullyQualifiedJavaType
//                .getNewListInstance();
//        FullyQualifiedJavaType listType;
//        if (introspectedTable.getRules().generateBaseRecordClass()) {
//            listType = new FullyQualifiedJavaType(introspectedTable
//                    .getBaseRecordType());
//        } else if (introspectedTable.getRules().generatePrimaryKeyClass()) {
//            listType = new FullyQualifiedJavaType(introspectedTable
//                    .getPrimaryKeyType());
//        } else {
//            throw new RuntimeException(getString("RuntimeError.12")); //$NON-NLS-1$
//        }
//
//        importedTypes.add(listType);
//        returnType.addTypeArgument(listType);
//        method.setReturnType(returnType);
        
//        FullyQualifiedJavaType returnType = introspectedTable.getRules().calculateAllFieldsClass();
          
        FullyQualifiedJavaType returnType = new FullyQualifiedJavaType(introspectedTable.getBaseRecordType());
        method.setReturnType(returnType);
        importedTypes.add(returnType);

        method.setName(introspectedTable.getSelectScalarByExampleStatementId());
        method.addParameter(new Parameter(type, "example")); //$NON-NLS-1$

        context.getCommentGenerator().addGeneralMethodComment(method,
                introspectedTable);

        addMapperAnnotations(interfaze, method);
        
        if (context.getPlugins()
                .clientSelectScalarByExampleWithoutBLOBsMethodGenerated(method,
                        interfaze, introspectedTable)) {
            interfaze.addImportedTypes(importedTypes);
            interfaze.addMethod(method);
        }
    }

    public void addMapperAnnotations(Interface interfaze, Method method) {
        return;
    }
}
