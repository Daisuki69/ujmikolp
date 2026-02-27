package com.voyager.glimpse.manager.jobservice;

import C.h;
import Cg.c;
import Qf.b;
import S1.r;
import S1.s;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(21)
public class AnalyticsJobService extends JobService implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExecutorService f16228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f16229b = Executors.newSingleThreadExecutor();
    public JobScheduler c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f16230d;
    public JobParameters e;

    @Override // Qf.b
    public final void b() {
        r.f("AnalyticsJobService cancelSchedule");
        this.c.cancel(2);
    }

    @Override // Qf.b
    public final void finish() {
        r.f("AnalyticsJobService finish");
        jobFinished(this.e, true);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        r.f("AnalyticsJobService created");
        if (s.f5625a == null) {
            s.f5625a = Executors.newSingleThreadExecutor();
        }
        this.f16228a = s.f5625a;
        this.c = (JobScheduler) getSystemService("jobscheduler");
        this.f16230d = new c(25, this, (Object) null, (Object) null);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        r.f("AnalyticsJobService onDestroy");
        this.f16229b.shutdown();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        r.f("AnalyticsJobService onStartJob: " + jobParameters.getJobId());
        if (jobParameters.getJobId() != 2) {
            return true;
        }
        this.e = jobParameters;
        this.f16229b.submit(new h(this, 7));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        r.f("AnalyticsJobService onStopJob");
        return false;
    }
}
