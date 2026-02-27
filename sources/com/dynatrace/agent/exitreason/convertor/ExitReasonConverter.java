package com.dynatrace.agent.exitreason.convertor;

import We.s;
import android.app.ApplicationExitInfo;
import androidx.annotation.RequiresApi;
import bg.AbstractC0983W;
import cj.C1110A;
import cj.C1132s;
import cj.M;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.paymaya.domain.store.H0;
import defpackage.BacktraceFrame;
import defpackage.Cause;
import defpackage.Signal;
import defpackage.Thread;
import defpackage.Tombstone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.text.MatchResult;
import org.json.JSONException;
import org.json.JSONObject;
import yj.q;
import zj.C2576A;
import zj.C2581c;
import zj.f;
import zj.o;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class ExitReasonConverter {
    private final String extractNativeThreadsInfo(Tombstone tombstone) {
        Map<Integer, Thread> threads = tombstone.getThreads();
        if (threads.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n");
        sb2.append("ABI: " + tombstone.getArch().name());
        sb2.append(Global.NEWLINE);
        sb2.append("Process uptime: " + tombstone.getProcess_uptime() + 's');
        sb2.append(Global.NEWLINE);
        if (!tombstone.getCommand_line().isEmpty()) {
            sb2.append("Cmdline: " + tombstone.getCommand_line());
            sb2.append(Global.NEWLINE);
        }
        StringBuilder sb3 = new StringBuilder("pid: ");
        sb3.append(tombstone.getPid());
        sb3.append(", tid: ");
        sb3.append(tombstone.getTid());
        sb3.append(", name: ");
        Thread thread = threads.get(Integer.valueOf(tombstone.getTid()));
        sb3.append(thread != null ? thread.getName() : null);
        sb2.append(sb3.toString());
        sb2.append(Global.NEWLINE);
        Signal signal_info = tombstone.getSignal_info();
        if (signal_info != null) {
            sb2.append("signal " + signal_info.getNumber() + " (" + signal_info.getName() + "), code " + signal_info.getCode() + " (" + signal_info.getCode_name() + "), fault addr " + f.a(signal_info.getFault_address()));
            sb2.append(Global.NEWLINE);
        }
        Iterator<Map.Entry<Integer, Thread>> it = moveRootThreadToTop(M.o(threads), tombstone.getTid()).entrySet().iterator();
        while (it.hasNext()) {
            Thread value = it.next().getValue();
            sb2.append(value.getName() + ':');
            sb2.append(Global.NEWLINE);
            int i = 0;
            for (Object obj : value.getCurrent_backtrace()) {
                int i4 = i + 1;
                if (i < 0) {
                    C1132s.k();
                    throw null;
                }
                BacktraceFrame backtraceFrame = (BacktraceFrame) obj;
                sb2.append("      #" + C2576A.K(2, String.valueOf(i)) + " pc " + f.a(backtraceFrame.getRel_pc()) + ' ' + backtraceFrame.getFile_name() + " (" + backtraceFrame.getFunction_name() + '+' + backtraceFrame.getFunction_offset() + ") (BuildId: " + backtraceFrame.getBuild_id() + ')');
                sb2.append(Global.NEWLINE);
                i = i4;
            }
            sb2.append(Global.NEWLINE);
        }
        return sb2.toString();
    }

    private final String extractThreadsInfo(String str) {
        return q.l(q.n(o.c(str, new o("(?ms)^\".*?(?=\\n\\s*(?:DumpLatency|\\s*$))")), new H0(22)), "\n\n");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String extractThreadsInfo$lambda$10(MatchResult it) {
        j.g(it, "it");
        return it.getValue();
    }

    private final JSONObject generateBaseJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
        jSONObject.put(EventKeys.ERROR.IS_FATAL, true);
        return jSONObject;
    }

    private final Map<Integer, Thread> moveRootThreadToTop(Map<Integer, Thread> map, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Thread thread = map.get(Integer.valueOf(i));
        if (thread != null) {
            linkedHashMap.put(Integer.valueOf(i), thread);
        }
        for (Map.Entry<Integer, Thread> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Thread value = entry.getValue();
            if (iIntValue != i) {
                linkedHashMap.put(Integer.valueOf(iIntValue), value);
            }
        }
        return linkedHashMap;
    }

    private final void putExceptionType(JSONObject jSONObject, Tombstone tombstone) throws JSONException {
        String abort_message = tombstone.getAbort_message();
        String strY = null;
        if (abort_message.length() <= 0 || !z.w(abort_message, 2, "terminating with uncaught exception of type ", false)) {
            abort_message = null;
        }
        if (abort_message != null) {
            String strSubstring = abort_message.substring(44);
            j.f(strSubstring, "substring(...)");
            strY = C2576A.Y(strSubstring, ": ");
        }
        putOptional$default(this, jSONObject, EventKeys.EXCEPTION.TYPE, strY, null, 4, null);
    }

    private final void putMessage(JSONObject jSONObject, Tombstone tombstone, String str) throws JSONException {
        String name;
        if (tombstone.getAbort_message().length() > 0) {
            str = tombstone.getAbort_message();
        } else if (tombstone.getCauses().isEmpty()) {
            Signal signal_info = tombstone.getSignal_info();
            if (signal_info != null && (name = signal_info.getName()) != null && name.length() > 0) {
                str = tombstone.getSignal_info().getName();
            } else if (tombstone.getSignal_info() != null && tombstone.getSignal_info().getNumber() != 0) {
                str = "signal " + tombstone.getSignal_info().getNumber();
            }
        } else {
            str = C1110A.F(tombstone.getCauses(), ". ", null, null, new H0(23), 30);
        }
        putOptional$default(this, jSONObject, EventKeys.EXCEPTION.MESSAGE, str, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence putMessage$lambda$4(Cause cause) {
        j.g(cause, "cause");
        return cause.getHuman_readable();
    }

    private final void putOptional(JSONObject jSONObject, String str, String str2, String str3) throws JSONException {
        if (str2 == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, str3);
        } else {
            jSONObject.put(str, str2);
        }
    }

    public static /* synthetic */ void putOptional$default(ExitReasonConverter exitReasonConverter, JSONObject jSONObject, String str, String str2, String str3, int i, Object obj) throws JSONException {
        if ((i & 4) != 0) {
            str3 = s.j("key ", str, " dropped because extracted value is 'null'");
        }
        exitReasonConverter.putOptional(jSONObject, str, str2, str3);
    }

    private final void putSignalCrashName(JSONObject jSONObject, Tombstone tombstone) throws JSONException {
        Signal signal_info = tombstone.getSignal_info();
        String name = null;
        if (signal_info != null) {
            if (signal_info.getName().length() > 0) {
                name = signal_info.getName();
            } else if (signal_info.getNumber() != 0) {
                name = "signal " + signal_info.getNumber();
            }
        }
        putOptional$default(this, jSONObject, EventKeys.EXCEPTION.CRASH_SIGNAL, name, null, 4, null);
    }

    private final void putStackTrace(JSONObject jSONObject, Tombstone tombstone) throws JSONException {
        putOptional(jSONObject, EventKeys.EXCEPTION.STACK_TRACE, extractNativeThreadsInfo(tombstone), "native crash threads cannot be extracted");
    }

    @RequiresApi(30)
    public final JSONObject convertAnr(ApplicationExitInfo applicationExitInfo) throws IOException {
        j.g(applicationExitInfo, "applicationExitInfo");
        Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "anr " + applicationExitInfo);
        try {
            JSONObject jSONObjectGenerateBaseJson = generateBaseJson();
            jSONObjectGenerateBaseJson.put(EventKeys.Characteristics.HAS_ANR, true);
            if (applicationExitInfo.getDescription() != null) {
                jSONObjectGenerateBaseJson.put(EventKeys.EXCEPTION.MESSAGE, applicationExitInfo.getDescription());
            }
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream == null) {
                return jSONObjectGenerateBaseJson;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream, C2581c.f21468b), 8192);
            try {
                String strX = AbstractC0983W.x(bufferedReader);
                bufferedReader.close();
                String strExtractThreadsInfo = extractThreadsInfo(strX);
                if (strExtractThreadsInfo.length() > 0) {
                    jSONObjectGenerateBaseJson.put(EventKeys.EXCEPTION.STACK_TRACE, strExtractThreadsInfo);
                    return jSONObjectGenerateBaseJson;
                }
                Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "anr threads don't match pattern");
                return jSONObjectGenerateBaseJson;
            } finally {
            }
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "anr event cannot be created");
            return null;
        }
    }

    @RequiresApi(30)
    public final JSONObject convertNativeCrash(ApplicationExitInfo applicationExitInfo) {
        j.g(applicationExitInfo, "applicationExitInfo");
        Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "native crash " + applicationExitInfo);
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            Tombstone tombstoneDecode = traceInputStream != null ? Tombstone.ADAPTER.decode(traceInputStream) : null;
            if (tombstoneDecode != null) {
                return parseNativeCrash$com_dynatrace_agent_release(tombstoneDecode, applicationExitInfo.getDescription());
            }
            JSONObject jSONObjectGenerateBaseJson = generateBaseJson();
            jSONObjectGenerateBaseJson.put(EventKeys.Characteristics.HAS_CRASH, true);
            putOptional(jSONObjectGenerateBaseJson, EventKeys.EXCEPTION.MESSAGE, applicationExitInfo.getDescription(), "applicationExitInfo.description is null");
            return jSONObjectGenerateBaseJson;
        } catch (Exception unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "native crash event cannot be created");
            return null;
        }
    }

    @RequiresApi(30)
    public final JSONObject parseNativeCrash$com_dynatrace_agent_release(Tombstone tombstone, String str) throws JSONException {
        j.g(tombstone, "tombstone");
        JSONObject jSONObjectGenerateBaseJson = generateBaseJson();
        jSONObjectGenerateBaseJson.put(EventKeys.Characteristics.HAS_CRASH, true);
        putMessage(jSONObjectGenerateBaseJson, tombstone, str);
        putSignalCrashName(jSONObjectGenerateBaseJson, tombstone);
        putExceptionType(jSONObjectGenerateBaseJson, tombstone);
        putStackTrace(jSONObjectGenerateBaseJson, tombstone);
        return jSONObjectGenerateBaseJson;
    }
}
