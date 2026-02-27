package com.tencent.could.component.common.ai.log;

import We.s;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class c extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimpleDateFormat f15554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Date f15555b;
    public AiLogConfig c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f15556d;
    public WeakReference<Context> e;

    public c(Looper looper, AiLogConfig aiLogConfig, Context context) {
        super(looper);
        this.c = aiLogConfig;
        this.e = new WeakReference<>(context);
    }

    public final void a(String str) {
        File file;
        File file2;
        WeakReference<Context> weakReference = this.e;
        Context context = weakReference == null ? null : weakReference.get();
        if (context == null) {
            Log.e("FileWriteHandler", "current context is null!");
            return;
        }
        if (this.f15556d == null) {
            this.f15556d = new f(context);
        }
        f fVar = this.f15556d;
        if (fVar == null) {
            Log.e("FileWriteHandler", "writer is null!");
            return;
        }
        if (fVar.f15563b == null || (file2 = fVar.f15562a) == null || !file2.exists()) {
            f fVar2 = this.f15556d;
            boolean zIsUseExternalFile = this.c.isUseExternalFile();
            String dirLog = this.c.getDirLog();
            String logName = this.c.getLogName();
            boolean zIsUseOriginFileName = this.c.isUseOriginFileName();
            WeakReference<Context> weakReference2 = fVar2.c;
            if (weakReference2 == null) {
                Log.e("LogWriter", "contextReference is null");
            } else if (!zIsUseExternalFile || com.tencent.could.component.common.ai.utils.a.a(weakReference2.get())) {
                if (!zIsUseOriginFileName) {
                    StringBuilder sbV = s.v(logName, Global.HYPHEN);
                    sbV.append(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
                    sbV.append(".ailog");
                    logName = sbV.toString();
                }
                File file3 = new File(dirLog, logName);
                fVar2.f15562a = file3;
                if (!file3.exists()) {
                    try {
                        File file4 = new File(dirLog);
                        if (!file4.exists() && !file4.mkdirs()) {
                            Log.e("LogWriter", "create log dir error! dir: " + dirLog);
                        }
                        fVar2.f15562a.createNewFile();
                    } catch (Exception e) {
                        Log.e("LogWriter", "create log file error! e: " + e.getMessage());
                        fVar2.a();
                    }
                }
                try {
                    fVar2.f15563b = new BufferedWriter(new FileWriter(fVar2.f15562a, true));
                } catch (Exception e7) {
                    Log.e("LogWriter", "create writer error! e: " + e7.getMessage());
                    fVar2.a();
                }
            } else {
                Log.e("LogWriter", "no write file permission! ");
            }
            Log.e("FileWriteHandler", "writer open is fail! can not write : " + str);
            return;
        }
        f fVar3 = this.f15556d;
        if (fVar3 == null || fVar3.f15563b == null || (file = fVar3.f15562a) == null || !file.exists()) {
            return;
        }
        f fVar4 = this.f15556d;
        if (fVar4.f15563b == null) {
            Log.e("LogWriter", "writer is null!");
            return;
        }
        try {
            fVar4.f15563b.write(str);
            fVar4.f15563b.newLine();
            fVar4.f15563b.flush();
        } catch (Exception e10) {
            Log.e("LogWriter", "writer not work e: " + e10.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleMessage(android.os.Message r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = "deal with logInfo string error! e: "
            java.lang.String r1 = "FileWriteHandler"
            if (r6 != 0) goto Lc
            java.lang.String r6 = "msg is null!"
            android.util.Log.e(r1, r6)
            return
        Lc:
            int r2 = r6.what
            r3 = 1
            if (r2 != r3) goto L52
            java.lang.Object r6 = r6.obj
            boolean r2 = r6 instanceof com.tencent.could.component.common.ai.log.d
            if (r2 == 0) goto L52
            r2 = 0
            com.tencent.could.component.common.ai.log.d r6 = (com.tencent.could.component.common.ai.log.d) r6     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.lang.String r2 = r5.a(r6)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L27
            r5.a(r2)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L27
            if (r6 == 0) goto L52
            goto L44
        L24:
            r0 = move-exception
            r2 = r6
            goto L4a
        L27:
            r2 = move-exception
            goto L2f
        L29:
            r0 = move-exception
            goto L4a
        L2b:
            r6 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
        L2f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L24
            r3.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L24
            android.util.Log.e(r1, r0)     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L52
        L44:
            com.tencent.could.component.common.ai.log.e r0 = com.tencent.could.component.common.ai.log.e.a.f15561a
            r0.a(r6)
            goto L52
        L4a:
            if (r2 == 0) goto L51
            com.tencent.could.component.common.ai.log.e r6 = com.tencent.could.component.common.ai.log.e.a.f15561a
            r6.a(r2)
        L51:
            throw r0
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.could.component.common.ai.log.c.handleMessage(android.os.Message):void");
    }

    public final String a(d dVar) {
        if (this.c.isRecordLogContentOnly()) {
            return dVar.f15559d;
        }
        long j = dVar.f15558b;
        if (this.f15554a == null) {
            this.f15554a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        }
        if (this.f15555b == null) {
            this.f15555b = new Date();
        }
        this.f15555b.setTime(j);
        StringBuilder sb2 = new StringBuilder(this.f15554a.format(this.f15555b));
        sb2.append(Global.BLANK);
        sb2.append(dVar.e);
        sb2.append("/");
        sb2.append(dVar.f);
        int i = dVar.f15557a;
        StringBuilder sb3 = new StringBuilder(Global.BLANK);
        switch (i) {
            case 2:
                sb3.append("VERBOSE");
                break;
            case 3:
                sb3.append("DEBUG");
                break;
            case 4:
                sb3.append("INFO");
                break;
            case 5:
                sb3.append("WARN");
                break;
            case 6:
                sb3.append("ERROR");
                break;
            case 7:
                sb3.append("ASSERT");
                break;
            default:
                sb3.append("null");
                break;
        }
        sb2.append(sb3.toString());
        sb2.append("/");
        sb2.append(dVar.c);
        sb2.append(": ");
        sb2.append(dVar.f15559d);
        return sb2.toString();
    }
}
