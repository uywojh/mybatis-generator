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
package org.mybatis.generator.codegen.mybatis3.xmlmapper.elements;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;

/**
 * 
 * @author Jeff Butler
 * 
 */
public class DeleteByXuidElementGenerator extends
        AbstractXmlElementGenerator {

    private boolean isSimple;
    
    public DeleteByXuidElementGenerator(boolean isSimple) {
        super();
        this.isSimple = isSimple;
    }

    @Override
    public void addElements(XmlElement parentElement) {
        XmlElement answer = new XmlElement("delete"); //$NON-NLS-1$

        IntrospectedColumn col = introspectedTable.getXuidColumn();
        
        answer.addAttribute(new Attribute(
                "id", introspectedTable.getDeleteByXuidStatementId())); //$NON-NLS-1$
        String parameterClass;
        if (!isSimple && introspectedTable.getRules().generateXuidClass()) {
            parameterClass = introspectedTable.getXuidType();
        } else {
            parameterClass = col.getFullyQualifiedJavaType().toString();
        }
        answer.addAttribute(new Attribute("parameterType", //$NON-NLS-1$
                parameterClass));

        context.getCommentGenerator().addComment(answer);

        StringBuilder sb = new StringBuilder();
        sb.append("delete from "); //$NON-NLS-1$
        sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
        answer.addElement(new TextElement(sb.toString()));

        boolean and = false; 
        sb.setLength(0);
        if (and) {
            sb.append("  and "); //$NON-NLS-1$
        } else {
            sb.append("where "); //$NON-NLS-1$
            and = true;
        }
        sb.append(MyBatis3FormattingUtilities
                .getEscapedColumnName(col));
        sb.append(" = "); //$NON-NLS-1$
        sb.append(MyBatis3FormattingUtilities
                .getParameterClause(col));
        answer.addElement(new TextElement(sb.toString()));
      

        if (context.getPlugins()
                .sqlMapDeleteByXuidElementGenerated(answer,
                        introspectedTable)) {
            parentElement.addElement(answer);
        }
    }
}
