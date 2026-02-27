package i1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import c1.i;
import c1.p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import j1.C1659g;
import j1.InterfaceC1656d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;
import k2.v0;
import m1.AbstractC1844a;

/* JADX INFO: renamed from: i1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1583c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1656d f17072b;
    public final C1581a c;

    public C1583c(Context context, InterfaceC1656d interfaceC1656d, C1581a c1581a) {
        this.f17071a = context;
        this.f17072b = interfaceC1656d;
        this.c = c1581a;
    }

    public final void a(p pVar, int i, boolean z4) {
        char c;
        char c10 = 4;
        Context context = this.f17071a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        i iVar = (i) pVar;
        adler32.update(iVar.f9230a.getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC1844a.a(iVar.c)).array());
        byte[] bArr = iVar.f9231b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (z4) {
            c = c10;
        } else {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                c = c10;
                int i4 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() != value) {
                    c10 = c;
                } else if (i4 >= i) {
                    v0.e("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
                    return;
                }
            }
            c = c10;
        }
        Cursor cursorRawQuery = ((C1659g) this.f17072b).b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{iVar.f9230a, String.valueOf(AbstractC1844a.a(iVar.c))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            i iVar2 = (i) pVar;
            C1581a c1581a = this.c;
            Z0.e eVar = iVar2.c;
            builder.setMinimumLatency(c1581a.a(eVar, jLongValue, i));
            Set set = ((C1582b) c1581a.f17068b.get(eVar)).c;
            if (set.contains(EnumC1584d.f17073a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC1584d.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC1584d.f17074b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", iVar2.f9230a);
            persistableBundle.putInt("priority", AbstractC1844a.a(eVar));
            byte[] bArr2 = iVar2.f9231b;
            if (bArr2 != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr2, 0));
            }
            builder.setExtras(persistableBundle);
            Integer numValueOf = Integer.valueOf(value);
            Long lValueOf2 = Long.valueOf(c1581a.a(eVar, jLongValue, i));
            Integer numValueOf2 = Integer.valueOf(i);
            Object[] objArr = new Object[5];
            objArr[0] = pVar;
            objArr[1] = numValueOf;
            objArr[2] = lValueOf2;
            objArr[3] = lValueOf;
            objArr[c] = numValueOf2;
            String strN = v0.n("JobInfoScheduler");
            if (Log.isLoggable(strN, 3)) {
                Log.d(strN, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }
}
