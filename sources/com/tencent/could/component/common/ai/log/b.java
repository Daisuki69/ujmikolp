package com.tencent.could.component.common.ai.log;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import com.tencent.could.component.common.ai.log.e;
import com.tencent.could.component.common.ai.utils.ThreadPoolUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AiLogConfig f15551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15552b = Process.myPid();
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference<Context> f15553d;
    public c e;
    public HandlerThread f;

    public b(Context context, AiLogConfig aiLogConfig) {
        this.f15551a = aiLogConfig;
        this.c = context.getPackageName();
        this.f15553d = new WeakReference<>(context);
        a(context);
    }

    public void a(Context context) {
        HandlerThread handlerThread = new HandlerThread("FileLogThread");
        this.f = handlerThread;
        handlerThread.start();
        this.e = new c(this.f.getLooper(), this.f15551a, context);
        ThreadPoolUtil.getInstance().addWork(new a(this, this.f15551a.getDirLog()));
    }

    public void a(int i, String str, String str2) {
        d dVarAcquire;
        if (this.f15551a.isOpen() && i >= this.f15551a.getMinLevel()) {
            if (this.f15551a.isLogCat()) {
                switch (i) {
                    case 2:
                        Log.v(str, str2);
                        break;
                    case 3:
                        Log.d(str, str2);
                        break;
                    case 4:
                        Log.i(str, str2);
                        break;
                    case 5:
                        Log.w(str, str2);
                        break;
                    case 6:
                        Log.e(str, str2);
                        break;
                    case 7:
                        Log.wtf(str, str2);
                        break;
                    default:
                        Log.e(str, "do not know logLevel ！ msg: " + str2);
                        break;
                }
            }
            e eVar = e.a.f15561a;
            eVar.getClass();
            synchronized (e.class) {
                dVarAcquire = eVar.f15560a.acquire();
            }
            if (dVarAcquire == null) {
                dVarAcquire = new d(i, str, str2);
            } else {
                dVarAcquire.f15558b = System.currentTimeMillis();
                dVarAcquire.f15557a = i;
                dVarAcquire.c = str;
                dVarAcquire.f15559d = str2;
            }
            long id = Thread.currentThread().getId();
            dVarAcquire.e = this.f15552b + Global.HYPHEN + id;
            dVarAcquire.f = this.c;
            c cVar = this.e;
            if (cVar != null) {
                Message messageObtainMessage = cVar.obtainMessage();
                messageObtainMessage.what = 1;
                messageObtainMessage.obj = dVarAcquire;
                cVar.sendMessage(messageObtainMessage);
            }
        }
    }
}
