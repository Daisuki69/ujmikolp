package com.dynatrace.android.callback;

import We.s;
import android.app.Application;
import android.view.MenuItem;
import android.view.View;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.conf.ConfigurationFactory;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CallbackCore;
import com.dynatrace.android.callback.CbConstants;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Callback {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "Callback");
    public static boolean useRequestHeaders = false;
    public static boolean useResponseHeaders = false;

    private Callback() {
    }

    public static void connect(URLConnection uRLConnection) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        uRLConnection.connect();
    }

    public static Object getContent(URLConnection uRLConnection) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getContent();
    }

    public static String getContentEncoding(URLConnection uRLConnection) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getContentEncoding();
    }

    public static int getContentLength(URLConnection uRLConnection) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getContentLength();
    }

    public static long getContentLengthLong(URLConnection uRLConnection) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getContentLengthLong();
    }

    public static String getContentType(URLConnection uRLConnection) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getContentType();
    }

    public static long getDate(URLConnection uRLConnection) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getDate();
    }

    public static InputStream getErrorStream(HttpURLConnection httpURLConnection) throws Exception {
        if (Global.isAlive.get()) {
            setWebRequestTag(httpURLConnection);
        }
        return httpURLConnection.getErrorStream();
    }

    public static long getExpiration(URLConnection uRLConnection) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getExpiration();
    }

    public static String getHeaderField(URLConnection uRLConnection, String str) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getHeaderField(str);
    }

    public static long getHeaderFieldDate(URLConnection uRLConnection, String str, long j) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getHeaderFieldDate(str, j);
    }

    public static int getHeaderFieldInt(URLConnection uRLConnection, String str, int i) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getHeaderFieldInt(str, i);
    }

    public static String getHeaderFieldKey(URLConnection uRLConnection, int i) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getHeaderFieldKey(i);
    }

    public static long getHeaderFieldLong(URLConnection uRLConnection, String str, long j) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getHeaderFieldLong(str, j);
    }

    public static Map<String, List<String>> getHeaderFields(URLConnection uRLConnection) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getHeaderFields();
    }

    public static InputStream getInputStream(URLConnection uRLConnection) throws Exception {
        return uRLConnection instanceof HttpURLConnection ? getInputStream((HttpURLConnection) uRLConnection) : uRLConnection.getInputStream();
    }

    public static long getLastModified(URLConnection uRLConnection) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getLastModified();
    }

    public static OutputStream getOutputStream(URLConnection uRLConnection) throws Exception {
        return uRLConnection instanceof HttpURLConnection ? getOutputStream((HttpURLConnection) uRLConnection) : uRLConnection.getOutputStream();
    }

    private static int getRespCodeFromConn(HttpURLConnection httpURLConnection, ConnStateParms connStateParms) {
        int responseCode;
        try {
            responseCode = httpURLConnection.getResponseCode();
        } catch (Exception e) {
            e = e;
            responseCode = -1;
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            connStateParms.reasonPhrase = responseMessage;
            connStateParms.reason = responseMessage;
        } catch (Exception e7) {
            e = e7;
            if (connStateParms.reason == null) {
                connStateParms.reason = e.getMessage();
            }
        }
        connStateParms.respCode = responseCode;
        return responseCode;
    }

    public static int getResponseCode(HttpURLConnection httpURLConnection) throws Exception {
        if (!Global.isAlive.get()) {
            return httpURLConnection.getResponseCode();
        }
        setWebRequestTag(httpURLConnection);
        ConnStateParms connStateParms = new ConnStateParms(httpURLConnection, CbConstants.WrMethod.getResponseCode, CbConstants.WrStates.PRE_EXEC, 0, useResponseHeaders, useRequestHeaders);
        int responseCode = -1;
        try {
            try {
                updateConnection(connStateParms);
                responseCode = httpURLConnection.getResponseCode();
                getRespCodeFromConn(httpURLConnection, connStateParms);
                connStateParms.state = CbConstants.WrStates.POST_EXEC_OK;
                updateConnection(connStateParms);
                return responseCode;
            } catch (Exception e) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "tracked failed 'getResponseCode' method call");
                connStateParms.reason = e.toString();
                connStateParms.exception = e;
                throw e;
            }
        } finally {
            connStateParms.respCode = responseCode;
            connStateParms.state = CbConstants.WrStates.POST_EXEC_ERR;
            updateConnection(connStateParms);
        }
    }

    public static String getResponseMessage(HttpURLConnection httpURLConnection) throws Exception {
        if (Global.isAlive.get()) {
            setWebRequestTag(httpURLConnection);
        }
        return httpURLConnection.getResponseMessage();
    }

    public static void newInstance(HttpURLConnection httpURLConnection) {
        if (Global.isAlive.get()) {
            CallbackCore.addConnection(httpURLConnection, false);
        }
    }

    public static void onClick_enter(View view) {
        if (Global.isAlive.get()) {
            CallbackCore.onUserActionEnter(CallbackCore.ListenerActionType.Clicked, view);
        }
    }

    public static void onClick_exit() {
        CallbackCore.onUserActionExit(CallbackCore.ListenerActionType.Clicked);
    }

    public static void onCreate(Application application) {
        CallbackCore.init(application, ConfigurationFactory.getConfiguration());
    }

    public static void onItemClick_enter(View view, int i) {
        if (Global.isAlive.get()) {
            CallbackCore.onUserActionEnter(CallbackCore.ListenerActionType.ItemClicked, view);
        }
    }

    public static void onItemClick_exit() {
        CallbackCore.onUserActionExit(CallbackCore.ListenerActionType.ItemClicked);
    }

    public static void onItemSelected_enter(View view, int i) {
        if (Global.isAlive.get()) {
            CallbackCore.onUserActionEnter(CallbackCore.ListenerActionType.ItemSelected, view);
        }
    }

    public static void onItemSelected_exit() {
        CallbackCore.onUserActionExit(CallbackCore.ListenerActionType.ItemSelected);
    }

    public static void onMenuItemClick_enter(MenuItem menuItem) {
        if (Global.isAlive.get()) {
            CallbackCore.onUserActionEnter(CallbackCore.ListenerActionType.MenuItemClick, menuItem);
        }
    }

    public static void onMenuItemClick_exit() {
        CallbackCore.onUserActionExit(CallbackCore.ListenerActionType.MenuItemClick);
    }

    public static void onOptionsItemSelected_enter(MenuItem menuItem) {
        if (Global.isAlive.get()) {
            CallbackCore.onUserActionEnter(CallbackCore.ListenerActionType.OptionsItemSelected, menuItem);
        }
    }

    public static void onOptionsItemSelected_exit() {
        CallbackCore.onUserActionExit(CallbackCore.ListenerActionType.OptionsItemSelected);
    }

    public static void onPageSelected_enter(int i) {
        if (Global.isAlive.get()) {
            CallbackCore.onUserActionEnter(CallbackCore.ListenerActionType.PageSelected);
        }
    }

    public static void onPageSelected_exit() {
        CallbackCore.onUserActionExit(CallbackCore.ListenerActionType.PageSelected);
    }

    public static void onRefresh_enter() {
        if (Global.isAlive.get()) {
            CallbackCore.ListenerActionType listenerActionType = CallbackCore.ListenerActionType.SwipeToRefresh;
            CallbackCore.onUserActionEnter(listenerActionType, listenerActionType.toString());
        }
    }

    public static void onRefresh_exit() {
        CallbackCore.onUserActionExit(CallbackCore.ListenerActionType.SwipeToRefresh);
    }

    public static void openConnection(URLConnection uRLConnection) {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            CallbackCore.addConnection((HttpURLConnection) uRLConnection, true);
        }
    }

    private static void setWebRequestTag(HttpURLConnection httpURLConnection) {
        try {
            String requestProperty = httpURLConnection.getRequestProperty("x-dtc");
            String requestProperty2 = httpURLConnection.getRequestProperty(Dynatrace.getRequestTagHeader());
            if (requestProperty == null && requestProperty2 == null) {
                CallbackCore.setWebReqTag(httpURLConnection);
                return;
            }
            Utility.devLog(LOGTAG, "web request tags already exists: x-dtc=" + requestProperty + " x-dynatrace=" + requestProperty2);
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, e.toString());
            }
        }
    }

    private static void updateConnection(ConnStateParms connStateParms) {
        try {
            CallbackCore.updateConnection(connStateParms);
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, connStateParms.toString(), e);
            }
        }
    }

    public static void connect(HttpURLConnection httpURLConnection) throws Exception {
        if (Global.isAlive.get()) {
            setWebRequestTag(httpURLConnection);
        }
        httpURLConnection.connect();
    }

    public static Object getContent(URLConnection uRLConnection, Class[] clsArr) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getContent(clsArr);
    }

    public static String getHeaderField(URLConnection uRLConnection, int i) throws Exception {
        if (Global.isAlive.get() && (uRLConnection instanceof HttpURLConnection)) {
            setWebRequestTag((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getHeaderField(i);
    }

    public static InputStream getInputStream(HttpURLConnection httpURLConnection) throws Exception {
        if (!Global.isAlive.get()) {
            return httpURLConnection.getInputStream();
        }
        setWebRequestTag(httpURLConnection);
        ConnStateParms connStateParms = new ConnStateParms(httpURLConnection, CbConstants.WrMethod.getInputStream, CbConstants.WrStates.PRE_EXEC, 0, useResponseHeaders, useRequestHeaders);
        try {
            try {
                updateConnection(connStateParms);
                InputStream inputStream = httpURLConnection.getInputStream();
                getRespCodeFromConn(httpURLConnection, connStateParms);
                connStateParms.state = CbConstants.WrStates.POST_EXEC_OK;
                updateConnection(connStateParms);
                getRespCodeFromConn(httpURLConnection, connStateParms);
                connStateParms.state = CbConstants.WrStates.POST_EXEC_ERR;
                updateConnection(connStateParms);
                return inputStream;
            } catch (Exception e) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "tracked failed 'getInputStream' method call");
                connStateParms.reason = e.toString();
                connStateParms.exception = e;
                throw e;
            }
        } catch (Throwable th2) {
            getRespCodeFromConn(httpURLConnection, connStateParms);
            connStateParms.state = CbConstants.WrStates.POST_EXEC_ERR;
            updateConnection(connStateParms);
            throw th2;
        }
    }

    public static OutputStream getOutputStream(HttpURLConnection httpURLConnection) throws Exception {
        if (!Global.isAlive.get()) {
            return httpURLConnection.getOutputStream();
        }
        setWebRequestTag(httpURLConnection);
        ConnStateParms connStateParms = new ConnStateParms(httpURLConnection, CbConstants.WrMethod.getOutputStream, CbConstants.WrStates.PRE_EXEC, 0, useResponseHeaders, useRequestHeaders);
        try {
            try {
                updateConnection(connStateParms);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                connStateParms.state = CbConstants.WrStates.POST_EXEC_OK;
                updateConnection(connStateParms);
                connStateParms.state = CbConstants.WrStates.POST_EXEC_ERR;
                updateConnection(connStateParms);
                return outputStream;
            } catch (Exception e) {
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "tracked failed 'getOutputStream' method call");
                connStateParms.reason = e.toString();
                connStateParms.exception = e;
                throw e;
            }
        } catch (Throwable th2) {
            connStateParms.state = CbConstants.WrStates.POST_EXEC_ERR;
            updateConnection(connStateParms);
            throw th2;
        }
    }
}
