package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import K.c;
import Z0.e;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.g;
import c1.i;
import c1.s;
import i1.f;
import m1.AbstractC1844a;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9610a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i4 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        if (string == null) {
            throw new NullPointerException("Null backendName");
        }
        e eVarB = AbstractC1844a.b(i);
        byte[] bArrDecode = string2 != null ? Base64.decode(string2, 0) : null;
        f fVar = s.a().f9250d;
        i iVar = new i(string, bArrDecode, eVarB);
        g gVar = new g(29, this, jobParameters);
        fVar.getClass();
        fVar.e.execute(new c(fVar, iVar, i4, gVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
