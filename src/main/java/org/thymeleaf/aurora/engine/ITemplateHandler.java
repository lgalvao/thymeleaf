/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.aurora.engine;

/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 * 
 */
public interface ITemplateHandler {




    public void handleDocumentStart(final long startTimeNanos, final int line, final int col);



    public void handleDocumentEnd(
            final long endTimeNanos, final long totalTimeNanos, final int line, final int col);



    public void handleXmlDeclaration(
            final String xmlDeclaration,
            final String keyword,
            final String version,
            final String encoding,
            final String standalone,
            final int line, final int col);



    public void handleDocType(
            final String docType,
            final String keyword,
            final String elementName,
            final String type,
            final String publicId,
            final String systemId,
            final String internalSubset,
            final int line, final int col);



    public void handleCDATASection(
            final char[] buffer,
            final int contentOffset, final int contentLen,
            final int outerOffset, final int outerLen,
            final int line, final int col);



    public void handleComment(
            final char[] buffer,
            final int contentOffset, final int contentLen,
            final int outerOffset, final int outerLen,
            final int line, final int col);


    public void handleText(
            final char[] buffer,
            final int offset, final int len,
            final int line, final int col);


    public void handleStandaloneElement(
            final ElementDefinition elementDefinition,
            final String name,
            final Attributes attributes,
            final boolean minimized,
            final int line, final int col);


    public void handleOpenElement(
            final ElementDefinition elementDefinition,
            final String name,
            final Attributes attributes,
            final int line, final int col);


    public void handleAutoOpenElement(
            final ElementDefinition elementDefinition,
            final String name,
            final Attributes attributes,
            final int line, final int col);


    public void handleCloseElement(
            final ElementDefinition elementDefinition,
            final String name,
            final int line, final int col);


    public void handleAutoCloseElement(
            final ElementDefinition elementDefinition,
            final String name,
            final int line, final int col);


    public void handleUnmatchedCloseElement(
            final ElementDefinition elementDefinition,
            final String name,
            final int line, final int col);



    public void handleProcessingInstruction(
            final String processingInstruction,
            final String target,
            final String content,
            final int line, final int col);



}