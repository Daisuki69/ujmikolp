package com.dynatrace.agent.events.error;

import com.dynatrace.agent.events.EventFieldsProvider;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.enrichment.JsonObjectExtensionsKt;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ErrorEvent {
    private static final int MAX_SIZE_OF_EXCEPTION_MESSAGE_IN_BYTES = 24000;
    private static final int MAX_SIZE_OF_STACK_TRACE_IN_BYTES = 224000;

    public static class ExceptionInfo {
        private String className;
        private String message;
        private String stacktrace;

        public ExceptionInfo(String str, String str2, String str3) {
            this.className = str;
            this.message = str2;
            this.stacktrace = str3;
        }

        public String getClassName() {
            return this.className;
        }

        public String getMessage() {
            return this.message;
        }

        public String getStacktrace() {
            return this.stacktrace;
        }
    }

    public static JSONObject crashEvent(Throwable th2) {
        try {
            JSONObject jSONObjectGenerateBaseErrorEvent = generateBaseErrorEvent(th2);
            jSONObjectGenerateBaseErrorEvent.put(EventKeys.Characteristics.HAS_CRASH, true);
            jSONObjectGenerateBaseErrorEvent.put(EventKeys.ERROR.IS_FATAL, true);
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "crash event: " + jSONObjectGenerateBaseErrorEvent);
            return jSONObjectGenerateBaseErrorEvent;
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "crash event can't be generated");
            return null;
        }
    }

    public static JSONObject errorExceptionEvent(Throwable th2, String str, boolean z4) {
        try {
            JSONObject jSONObjectGenerateBaseErrorEvent = generateBaseErrorEvent(th2);
            jSONObjectGenerateBaseErrorEvent.put(EventKeys.ERROR.NAME, str);
            jSONObjectGenerateBaseErrorEvent.put(EventKeys.ERROR.HAS_CUSTOM_NAME, true);
            jSONObjectGenerateBaseErrorEvent.put(EventKeys.Characteristics.HAS_EXCEPTION, true);
            if (z4) {
                jSONObjectGenerateBaseErrorEvent.put(EventKeys.DT.SUPPORT.LEGACY_API_REPORTED, true);
            }
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "error event: " + jSONObjectGenerateBaseErrorEvent);
            return jSONObjectGenerateBaseErrorEvent;
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "error event can't be generated");
            return null;
        }
    }

    public static ExceptionEventContent exceptionEvent(Throwable th2, EventFieldsProvider eventFieldsProvider) {
        try {
            return unsafeExceptionEvent(th2, eventFieldsProvider);
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "exception event can't be generated");
            return null;
        }
    }

    private static JSONObject generateBaseErrorEvent(Throwable th2) throws JSONException {
        ExceptionInfo throwable = parseThrowable(th2, MAX_SIZE_OF_STACK_TRACE_IN_BYTES, MAX_SIZE_OF_EXCEPTION_MESSAGE_IN_BYTES);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
        if (throwable.getMessage() != null) {
            jSONObject.put(EventKeys.EXCEPTION.MESSAGE, throwable.getMessage());
        }
        if (throwable.getClassName() != null) {
            jSONObject.put(EventKeys.EXCEPTION.TYPE, throwable.getClassName());
        }
        if (throwable.getStacktrace() != null) {
            jSONObject.put(EventKeys.EXCEPTION.STACK_TRACE, throwable.getStacktrace());
        }
        return jSONObject;
    }

    public static JSONObject generateErrorEvent(String str, int i, boolean z4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(EventKeys.ERROR.NAME, str);
            jSONObject.put(EventKeys.ERROR.HAS_CUSTOM_NAME, true);
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.ERROR.CODE, i);
            if (z4) {
                jSONObject.put(EventKeys.DT.SUPPORT.LEGACY_API_REPORTED, true);
            }
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "error code event: " + jSONObject);
            return jSONObject;
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "error code event can't be generated");
            return null;
        }
    }

    public static ExceptionInfo parseThrowable(Throwable th2, int i, int i4) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return new ExceptionInfo(th2.getClass().getName(), th2.getMessage() != null ? sanitizeThrowableMessage(th2.getMessage(), i4) : null, th2.getStackTrace().length > 0 ? sanitizeStackTrace(stringWriter.toString(), i) : null);
    }

    private static String sanitizeStackTrace(String str, int i) {
        return str.getBytes().length > i ? truncateAtLineBoundary(str, i) : str;
    }

    private static String sanitizeThrowableMessage(String str, int i) {
        byte[] bytes = str.getBytes();
        return bytes.length <= i ? str : new String(bytes, 0, i).concat("...");
    }

    private static String truncateAtLineBoundary(String str, int i) {
        StringBuilder sb2 = new StringBuilder();
        int length = 0;
        for (String str2 : str.split(Global.NEWLINE)) {
            length += str2.getBytes(StandardCharsets.UTF_8).length + 1;
            if (length > i) {
                sb2.append("...");
                return sb2.toString();
            }
            sb2.append(str2);
            sb2.append(Global.NEWLINE);
        }
        sb2.append("...");
        return sb2.toString();
    }

    private static ExceptionEventContent unsafeExceptionEvent(Throwable th2, EventFieldsProvider eventFieldsProvider) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = eventFieldsProvider != null ? validateFieldsProvider(eventFieldsProvider) : new JSONObject();
        } catch (Exception unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "exception event with problems in EventFieldsProvider");
            jSONObject2.put(EventKeys.DT.SUPPORT.API_HAS_ENRICH_EXCEPTION, true);
            jSONObject = new JSONObject();
        }
        ExceptionInfo throwable = parseThrowable(th2, MAX_SIZE_OF_STACK_TRACE_IN_BYTES, MAX_SIZE_OF_EXCEPTION_MESSAGE_IN_BYTES);
        jSONObject2.put(EventKeys.Characteristics.HAS_ERROR, true);
        if (throwable.getMessage() != null) {
            jSONObject2.put(EventKeys.EXCEPTION.MESSAGE, throwable.getMessage());
        }
        if (throwable.getClassName() != null) {
            jSONObject2.put(EventKeys.EXCEPTION.TYPE, throwable.getClassName());
        }
        if (throwable.getStacktrace() != null) {
            jSONObject2.put(EventKeys.EXCEPTION.STACK_TRACE, throwable.getStacktrace());
        }
        jSONObject2.put(EventKeys.Characteristics.HAS_EXCEPTION, true);
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "exception event: " + jSONObject2);
        return new ExceptionEventContent(jSONObject2, jSONObject);
    }

    private static JSONObject validateFieldsProvider(EventFieldsProvider eventFieldsProvider) throws Exception {
        JSONObject jSONObject = eventFieldsProvider.get();
        return jSONObject == null ? new JSONObject() : JsonObjectExtensionsKt.deepCopy(jSONObject);
    }

    public static ExceptionInfo parseThrowable(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return new ExceptionInfo(th2.getClass().getName(), th2.getMessage(), stringWriter.toString());
    }
}
