/* Copyright 2004 Acegi Technology Pty Limited
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

package net.sf.acegisecurity.adapters;

import java.io.BufferedReader;
import java.io.IOException;

import java.security.Principal;

import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * Mocks a <code>HttpServletRequest</code> and provides the
 * <code>getUserPrincipal()</code> method.
 *
 * @author Ben Alex
 * @version $Id$
 */
public class MockHttpServletRequest implements HttpServletRequest {
    //~ Instance fields ========================================================

    private Principal principal;

    //~ Constructors ===========================================================

    public MockHttpServletRequest(Principal principal) {
        this.principal = principal;
    }

    private MockHttpServletRequest() {
        super();
    }

    //~ Methods ================================================================

    public void setAttribute(String arg0, Object arg1) {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public Object getAttribute(String arg0) {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public Enumeration getAttributeNames() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getAuthType() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public void setCharacterEncoding(String arg0) {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getCharacterEncoding() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public int getContentLength() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getContentType() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getContextPath() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public Cookie[] getCookies() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public long getDateHeader(String arg0) {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getHeader(String arg0) {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public Enumeration getHeaderNames() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public Enumeration getHeaders(String arg0) {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public ServletInputStream getInputStream() throws IOException {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public int getIntHeader(String arg0) {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public Locale getLocale() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public Enumeration getLocales() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getMethod() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getParameter(String arg0) {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public Map getParameterMap() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public Enumeration getParameterNames() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String[] getParameterValues(String arg0) {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getPathInfo() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getPathTranslated() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getProtocol() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getQueryString() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public BufferedReader getReader() throws IOException {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getRealPath(String arg0) {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getRemoteAddr() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getRemoteHost() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getRemoteUser() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public RequestDispatcher getRequestDispatcher(String arg0) {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getRequestURI() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public StringBuffer getRequestURL() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getRequestedSessionId() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public boolean isRequestedSessionIdFromCookie() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public boolean isRequestedSessionIdFromURL() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public boolean isRequestedSessionIdFromUrl() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public boolean isRequestedSessionIdValid() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getScheme() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public boolean isSecure() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getServerName() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public int getServerPort() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public String getServletPath() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public HttpSession getSession(boolean arg0) {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public HttpSession getSession() {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public boolean isUserInRole(String arg0) {
        throw new UnsupportedOperationException("mock method not implemented");
    }

    public Principal getUserPrincipal() {
        return this.principal;
    }

    public void removeAttribute(String arg0) {
        throw new UnsupportedOperationException("mock method not implemented");
    }
}
