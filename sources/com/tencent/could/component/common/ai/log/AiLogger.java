package com.tencent.could.component.common.ai.log;

import android.content.Context;
import android.os.HandlerThread;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class AiLogger {
    public AiLogConfig config;
    public b printer;

    public AiLogger(Context context, AiLogConfig aiLogConfig) {
        this.config = aiLogConfig;
        this.printer = new b(context, aiLogConfig);
    }

    private String formatString(String str, Object... objArr) {
        if (str != null) {
            return String.format(str, objArr);
        }
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb2.append(", ");
            }
            sb2.append(objArr[i]);
        }
        return sb2.toString();
    }

    public void asset(String str, String str2) {
        b bVar = this.printer;
        if (bVar != null) {
            bVar.a(7, str, str2);
        }
    }

    public void debug(String str, String str2) {
        b bVar = this.printer;
        if (bVar != null) {
            bVar.a(3, str, str2);
        }
    }

    public void error(String str, String str2) {
        b bVar = this.printer;
        if (bVar != null) {
            bVar.a(6, str, str2);
        }
    }

    public void info(String str, String str2) {
        b bVar = this.printer;
        if (bVar != null) {
            bVar.a(4, str, str2);
        }
    }

    public void release() {
        b bVar = this.printer;
        if (bVar != null) {
            c cVar = bVar.e;
            if (cVar == null) {
                Log.e("FilePrinter", "writeHandler is null");
            } else {
                cVar.removeMessages(1);
                c cVar2 = bVar.e;
                f fVar = cVar2.f15556d;
                if (fVar != null) {
                    fVar.a();
                }
                cVar2.f15556d = null;
                bVar.e = null;
                HandlerThread handlerThread = bVar.f;
                if (handlerThread != null && handlerThread.isAlive()) {
                    bVar.f.quitSafely();
                }
            }
        }
        this.printer = null;
    }

    public void verbose(String str, String str2) {
        b bVar = this.printer;
        if (bVar != null) {
            bVar.a(3, str, str2);
        }
    }

    public void warn(String str, String str2) {
        b bVar = this.printer;
        if (bVar != null) {
            bVar.a(5, str, str2);
        }
    }

    public void asset(String str) {
        asset(this.config.getDefaultTag(), str);
    }

    public void debug(String str) {
        debug(this.config.getDefaultTag(), str);
    }

    public void error(String str) {
        error(this.config.getDefaultTag(), str);
    }

    public void info(String str) {
        info(this.config.getDefaultTag(), str);
    }

    public void verbose(String str) {
        verbose(this.config.getDefaultTag(), str);
    }

    public void warn(String str) {
        warn(this.config.getDefaultTag(), str);
    }

    public void asset(String str, String str2, Object... objArr) {
        asset(str, formatString(str2, objArr));
    }

    public void debug(String str, String str2, Object... objArr) {
        debug(str, formatString(str2, objArr));
    }

    public void error(String str, String str2, Object... objArr) {
        error(str, formatString(str2, objArr));
    }

    public void info(String str, String str2, Object... objArr) {
        info(str, formatString(str2, objArr));
    }

    public void verbose(String str, String str2, Object... objArr) {
        verbose(str, formatString(str2, objArr));
    }

    public void warn(String str, String str2, Object... objArr) {
        warn(str, formatString(str2, objArr));
    }
}
