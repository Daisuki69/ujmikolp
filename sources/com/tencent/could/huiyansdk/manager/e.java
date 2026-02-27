package com.tencent.could.huiyansdk.manager;

import android.os.Handler;
import android.os.Message;
import com.tencent.could.component.common.ai.log.AiLog;
import com.tencent.could.huiyansdk.callback.LoggerInfoCallBack;
import com.tencent.could.huiyansdk.utils.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Integer> f15685a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15686b = new Object();
    public LoggerInfoCallBack c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Handler f15687d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f15688a = new e();
    }

    public final void a(int i, String str, String str2) {
        if (i == 1) {
            if (d.a.f15733a.f15731a) {
                AiLog.debug(str, str2);
            }
        } else if (i == 2) {
            if (d.a.f15733a.f15731a) {
                AiLog.error(str, str2);
            }
        } else if (d.a.f15733a.f15731a) {
            AiLog.debug(str, str2);
        }
        if (this.c == null || this.f15687d == null) {
            return;
        }
        Message messageObtainMessage = this.f15687d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str2;
        this.f15687d.sendMessage(messageObtainMessage);
    }

    public void a() {
        if (this.c == null || this.f15687d == null) {
            return;
        }
        Message messageObtainMessage = this.f15687d.obtainMessage();
        messageObtainMessage.what = 2;
        this.f15687d.sendMessage(messageObtainMessage);
    }
}
