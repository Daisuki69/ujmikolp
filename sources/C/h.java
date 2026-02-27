package C;

import Ah.n;
import D.r;
import a7.ViewOnAttachStateChangeListenerC0636D;
import android.hardware.Camera;
import android.os.Handler;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.journeyapps.barcodescanner.BarcodeView;
import com.paymaya.domain.store.C1250b0;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.L;
import com.paymaya.mayaui.login.view.fragment.impl.MayaWizardFragment;
import com.paymaya.ui.common.view.widget.Carousel;
import com.paymaya.ui.qr.view.fragment.impl.BarcodeScannerFragment;
import com.paymaya.ui.qr.view.fragment.impl.QRScannerFragment;
import com.voyager.glimpse.manager.jobservice.AnalyticsJobService;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import dh.AbstractC1402a;
import io.flutter.plugin.platform.D;
import io.flutter.plugin.platform.s;
import io.split.android.client.storage.db.EventDao;
import io.split.android.client.storage.db.EventEntity;
import io.split.android.client.storage.db.GeneralInfoDao;
import io.split.android.client.storage.db.GeneralInfoEntity;
import io.split.android.client.storage.db.ImpressionDao;
import io.split.android.client.storage.db.ImpressionEntity;
import io.split.android.client.storage.db.ImpressionsCountDao;
import io.split.android.client.storage.db.ImpressionsCountEntity;
import io.split.android.client.storage.db.MyLargeSegmentDao;
import io.split.android.client.storage.db.MySegmentDao;
import io.split.android.client.storage.db.SplitDao;
import io.split.android.client.storage.db.SplitEntity;
import io.split.android.client.storage.db.SplitRoomDatabase;
import io.split.android.client.storage.db.attributes.AttributesDao;
import io.split.android.client.storage.db.attributes.AttributesEntity;
import io.split.android.client.storage.db.impressions.unique.UniqueKeyEntity;
import io.split.android.client.storage.db.impressions.unique.UniqueKeysDao;
import io.split.android.client.storage.db.rbs.RuleBasedSegmentDao;
import io.split.android.client.storage.db.rbs.RuleBasedSegmentEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import ki.C1783d;
import n.u;
import n.w;
import n.y;
import n4.C1917a;
import n4.C1920d;
import n4.C1921e;
import n4.C1922f;
import n4.RunnableC1918b;
import pg.t;
import ph.C2085j0;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f657b;

    public /* synthetic */ h(Object obj, int i) {
        this.f656a = i;
        this.f657b = obj;
    }

    private final void a() {
        if (((y) this.f657b).f18536d == null) {
            return;
        }
        w wVar = ((y) this.f657b).f18536d;
        Object obj = wVar.f18531a;
        if (obj == null) {
            y.a((y) this.f657b, wVar.f18532b);
            return;
        }
        y yVar = (y) this.f657b;
        synchronized (yVar) {
            Iterator it = new ArrayList(yVar.f18534a).iterator();
            while (it.hasNext()) {
                ((u) it.next()).onResult(obj);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        switch (this.f656a) {
            case 0:
                m mVar = (m) ((V2.c) this.f657b).f6042b;
                Handler handler = m.f661d;
                mVar.d();
                return;
            case 1:
                C1250b0 c1250b0 = ((r) this.f657b).f;
                if (c1250b0 != null) {
                    c1250b0.c.onNext(Boolean.valueOf(c1250b0.b()));
                    return;
                }
                return;
            case 2:
                Ci.a aVar = (Ci.a) this.f657b;
                AttributesDao attributesDao = ((SplitRoomDatabase) aVar.f781b).attributesDao();
                aVar.getClass();
                for (AttributesEntity attributesEntity : attributesDao.getAll()) {
                    String userKey = attributesEntity.getUserKey();
                    Gi.d dVar = (Gi.d) aVar.f782d;
                    String strR = dVar.r(userKey);
                    String strR2 = dVar.r(attributesEntity.getAttributes());
                    Gi.d dVar2 = (Gi.d) aVar.c;
                    String strA = dVar2.a(strR);
                    String strA2 = dVar2.a(strR2);
                    if (strA == null || strA2 == null) {
                        Ri.a.g(numX49.tnTj78("POk"));
                    } else {
                        attributesDao.update(userKey, strA, strA2);
                    }
                }
                SplitRoomDatabase splitRoomDatabase = (SplitRoomDatabase) aVar.f781b;
                GeneralInfoDao generalInfoDao = splitRoomDatabase.generalInfoDao();
                aVar.getClass();
                SplitDao splitDao = splitRoomDatabase.splitDao();
                List<SplitEntity> all = splitDao.getAll();
                splitRoomDatabase.getSplitQueryDao().invalidate();
                Iterator<SplitEntity> it = all.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    Gi.d dVar3 = (Gi.d) aVar.c;
                    Gi.d dVar4 = (Gi.d) aVar.f782d;
                    if (!zHasNext) {
                        GeneralInfoEntity byName = generalInfoDao.getByName(GeneralInfoEntity.TRAFFIC_TYPES_MAP);
                        if (byName != null && !byName.getStringValue().isEmpty()) {
                            String strA3 = dVar3.a(dVar4.r(byName.getStringValue()));
                            if (strA3 != null) {
                                generalInfoDao.update(new GeneralInfoEntity(GeneralInfoEntity.TRAFFIC_TYPES_MAP, strA3));
                            } else {
                                Ri.a.g(numX49.tnTj78("POu"));
                            }
                        }
                        String strTnTj78 = numX49.tnTj78("POV");
                        GeneralInfoEntity byName2 = generalInfoDao.getByName(strTnTj78);
                        if (byName2 != null && !byName2.getStringValue().isEmpty()) {
                            String strA4 = dVar3.a(dVar4.r(byName2.getStringValue()));
                            if (strA4 != null) {
                                generalInfoDao.update(new GeneralInfoEntity(strTnTj78, strA4));
                            } else {
                                Ri.a.g(numX49.tnTj78("POS"));
                            }
                        }
                        MySegmentDao mySegmentDao = ((SplitRoomDatabase) aVar.f781b).mySegmentDao();
                        aVar.getClass();
                        aVar.b(mySegmentDao, mySegmentDao.getAll());
                        MyLargeSegmentDao myLargeSegmentDao = ((SplitRoomDatabase) aVar.f781b).myLargeSegmentDao();
                        aVar.getClass();
                        aVar.b(myLargeSegmentDao, myLargeSegmentDao.getAll());
                        ImpressionDao impressionDao = ((SplitRoomDatabase) aVar.f781b).impressionDao();
                        aVar.getClass();
                        for (ImpressionEntity impressionEntity : impressionDao.getAll()) {
                            String testName = impressionEntity.getTestName();
                            Gi.d dVar5 = (Gi.d) aVar.f782d;
                            String strR3 = dVar5.r(testName);
                            String strR4 = dVar5.r(impressionEntity.getBody());
                            Gi.d dVar6 = (Gi.d) aVar.c;
                            String strA5 = dVar6.a(strR3);
                            String strA6 = dVar6.a(strR4);
                            if (strA5 == null || strA6 == null) {
                                Ri.a.g(numX49.tnTj78("POj"));
                            } else {
                                impressionEntity.setTestName(strA5);
                                impressionEntity.setBody(strA6);
                                impressionDao.insert(impressionEntity);
                            }
                        }
                        EventDao eventDao = ((SplitRoomDatabase) aVar.f781b).eventDao();
                        aVar.getClass();
                        for (EventEntity eventEntity : eventDao.getAll()) {
                            String strA7 = ((Gi.d) aVar.c).a(((Gi.d) aVar.f782d).r(eventEntity.getBody()));
                            if (strA7 != null) {
                                eventEntity.setBody(strA7);
                                eventDao.insert(eventEntity);
                            } else {
                                Ri.a.g(numX49.tnTj78("POd"));
                            }
                        }
                        ImpressionsCountDao impressionsCountDao = ((SplitRoomDatabase) aVar.f781b).impressionsCountDao();
                        aVar.getClass();
                        for (ImpressionsCountEntity impressionsCountEntity : impressionsCountDao.getAll()) {
                            String strA8 = ((Gi.d) aVar.c).a(((Gi.d) aVar.f782d).r(impressionsCountEntity.getBody()));
                            if (strA8 != null) {
                                impressionsCountEntity.setBody(strA8);
                                impressionsCountDao.insert(impressionsCountEntity);
                            } else {
                                Ri.a.g(numX49.tnTj78("POi"));
                            }
                        }
                        UniqueKeysDao uniqueKeysDao = ((SplitRoomDatabase) aVar.f781b).uniqueKeysDao();
                        aVar.getClass();
                        for (UniqueKeyEntity uniqueKeyEntity : uniqueKeysDao.getAll()) {
                            String userKey2 = uniqueKeyEntity.getUserKey();
                            Gi.d dVar7 = (Gi.d) aVar.f782d;
                            String strR5 = dVar7.r(userKey2);
                            String strR6 = dVar7.r(uniqueKeyEntity.getFeatureList());
                            Gi.d dVar8 = (Gi.d) aVar.c;
                            String strA9 = dVar8.a(strR5);
                            String strA10 = dVar8.a(strR6);
                            if (strA9 == null || strA10 == null) {
                                Ri.a.g(numX49.tnTj78("POE"));
                            } else {
                                uniqueKeyEntity.setUserKey(strA9);
                                uniqueKeyEntity.setFeatureList(strA10);
                                uniqueKeysDao.insert(uniqueKeyEntity);
                            }
                        }
                        RuleBasedSegmentDao ruleBasedSegmentDao = ((SplitRoomDatabase) aVar.f781b).ruleBasedSegmentDao();
                        aVar.getClass();
                        List<RuleBasedSegmentEntity> all2 = ruleBasedSegmentDao.getAll();
                        if (all2 == null) {
                            return;
                        }
                        for (RuleBasedSegmentEntity ruleBasedSegmentEntity : all2) {
                            String name = ruleBasedSegmentEntity.getName();
                            Gi.d dVar9 = (Gi.d) aVar.f782d;
                            String strR7 = dVar9.r(name);
                            String strR8 = dVar9.r(ruleBasedSegmentEntity.getBody());
                            Gi.d dVar10 = (Gi.d) aVar.c;
                            String strA11 = dVar10.a(strR7);
                            String strA12 = dVar10.a(strR8);
                            if (strA11 == null || strA12 == null) {
                                Ri.a.g(numX49.tnTj78("POF"));
                            } else {
                                ruleBasedSegmentDao.update(name, strA11, strA12);
                            }
                        }
                        return;
                    }
                    SplitEntity next = it.next();
                    String name2 = next.getName();
                    String strR9 = dVar4.r(name2);
                    String strR10 = dVar4.r(next.getBody());
                    String strA13 = dVar3.a(strR9);
                    String strA14 = dVar3.a(strR10);
                    if (strA13 == null || strA14 == null) {
                        Ri.a.g(numX49.tnTj78("POB"));
                    } else {
                        splitDao.update(name2, strA13, strA14);
                    }
                }
                break;
            case 3:
                Gh.e eVar = (Gh.e) this.f657b;
                try {
                    ((Ah.j) eVar.c).onComplete();
                    return;
                } finally {
                    ((n) eVar.f1992d).dispose();
                }
            case 4:
                AppStartTrace appStartTrace = (AppStartTrace) this.f657b;
                if (appStartTrace.i == null) {
                    appStartTrace.j = new Timer();
                    return;
                }
                return;
            case 5:
                Re.b bVar = (Re.b) this.f657b;
                ExoPlayer exoPlayer = bVar.f5493B;
                if (exoPlayer == null) {
                    return;
                }
                if (exoPlayer.getBufferedPosition() != bVar.f) {
                    bVar.b();
                }
                int playbackState = bVar.f5493B.getPlaybackState();
                if (playbackState == 2) {
                    bVar.f5497R.postDelayed(this, 200L);
                    return;
                } else {
                    if (playbackState != 3) {
                        return;
                    }
                    if (bVar.f5493B.getPlayWhenReady()) {
                        bVar.f5497R.postDelayed(this, 500L);
                        return;
                    } else {
                        bVar.f5497R.postDelayed(this, 1000L);
                        return;
                    }
                }
            case 6:
                Sf.a aVar2 = (Sf.a) this.f657b;
                ((Cg.c) aVar2.f5725d).t();
                Handler handler2 = (Handler) aVar2.e;
                if (handler2 != null) {
                    handler2.postDelayed(this, aVar2.f5723a);
                    return;
                }
                return;
            case 7:
                S1.r.f(numX49.tnTj78("POZ"));
                ((AnalyticsJobService) this.f657b).f16230d.t();
                return;
            case 8:
                ((t) ((V4.f) this.f657b).f6068b).notImplemented();
                return;
            case 9:
                throw new NullPointerException(((StringBuilder) this.f657b).toString());
            case 10:
                throw new RuntimeException((Exception) this.f657b);
            case 11:
                X2.m mVar2 = (X2.m) this.f657b;
                synchronized (mVar2) {
                    zA = mVar2.a();
                    if (zA) {
                        mVar2.j(true);
                    }
                    break;
                }
                if (zA) {
                    if (new Date(mVar2.f6513p.currentTimeMillis()).before(mVar2.f6514q.c().f6517b)) {
                        mVar2.i();
                        return;
                    }
                    C2.d dVar11 = (C2.d) mVar2.f6509k;
                    Task taskE = dVar11.e();
                    Task taskD = dVar11.d();
                    Task taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskE, taskD}).continueWithTask(mVar2.h, new Bb.c(11, mVar2, taskE, taskD));
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{taskContinueWithTask}).continueWith(mVar2.h, new A7.r(23, mVar2, taskContinueWithTask));
                    return;
                }
                return;
            case 12:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f657b;
                scheduledExecutorService.shutdown();
                try {
                    if (scheduledExecutorService.awaitTermination(5L, TimeUnit.SECONDS)) {
                        return;
                    }
                    scheduledExecutorService.shutdownNow();
                    return;
                } catch (InterruptedException unused) {
                    scheduledExecutorService.shutdownNow();
                    Thread.currentThread().interrupt();
                    return;
                }
            case 13:
                Xj.e eVar2 = (Xj.e) this.f657b;
                if (eVar2.f6691a != null && eVar2.c && eVar2.f6693d && eVar2.e) {
                    eVar2.a();
                    return;
                }
                return;
            case 14:
                ((CTInboxListViewFragment) this.f657b).f9548R.b();
                return;
            case 15:
                Carousel carousel = (Carousel) this.f657b;
                Rc.c cVar = carousel.j;
                kotlin.jvm.internal.j.d(cVar);
                if (cVar.getItemCount() > 1) {
                    if (carousel.getCarouselRecyclerView().getScrollState() == 0) {
                        carousel.f14452n++;
                        carousel.getCarouselRecyclerView().smoothScrollToPosition(carousel.f14452n);
                    }
                    Handler handler3 = carousel.f14451l;
                    if (handler3 != null) {
                        handler3.postDelayed(this, carousel.getCarouselIntervalTime());
                        return;
                    }
                    return;
                }
                return;
            case 16:
                BarcodeScannerFragment barcodeScannerFragment = (BarcodeScannerFragment) this.f657b;
                barcodeScannerFragment.f14665U.setBorderColor(-1);
                barcodeScannerFragment.f14665U.setErrorState(false);
                de.c cVar2 = barcodeScannerFragment.f14664T;
                cVar2.f6795l = barcodeScannerFragment;
                Xj.e eVar3 = cVar2.f6683b;
                if (eVar3 != null) {
                    eVar3.d();
                    return;
                }
                return;
            case 17:
                QRScannerFragment qRScannerFragment = (QRScannerFragment) this.f657b;
                qRScannerFragment.f14689U.setBorderColor(-1);
                qRScannerFragment.f14689U.setErrorState(false);
                de.n nVar = qRScannerFragment.f14688T;
                nVar.f6795l = qRScannerFragment;
                Xj.e eVar4 = nVar.f6683b;
                if (eVar4 != null) {
                    eVar4.d();
                    return;
                }
                return;
            case 18:
                ((AbstractC1402a) this.f657b).a();
                return;
            case 19:
                MayaWizardFragment mayaWizardFragment = (MayaWizardFragment) this.f657b;
                ViewPager2 viewPager2 = mayaWizardFragment.f12832X;
                String strTnTj782 = numX49.tnTj78("POr");
                if (viewPager2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                int currentItem = viewPager2.getCurrentItem() + 1;
                ViewPager2 viewPager22 = mayaWizardFragment.f12832X;
                if (viewPager22 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                viewPager22.setCurrentItem(currentItem, true);
                Handler handler4 = mayaWizardFragment.f12834Z;
                if (handler4 != null) {
                    handler4.postDelayed(this, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                    return;
                }
                return;
            case 20:
                ViewOnAttachStateChangeListenerC0636D viewOnAttachStateChangeListenerC0636D = (ViewOnAttachStateChangeListenerC0636D) this.f657b;
                viewOnAttachStateChangeListenerC0636D.f7006b.postDelayed((s) viewOnAttachStateChangeListenerC0636D.c, 128L);
                return;
            case 21:
                D d10 = (D) this.f657b;
                d10.f17210a.getViewTreeObserver().removeOnDrawListener(d10);
                return;
            case 22:
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f657b;
                ((SplitRoomDatabase) rVar.f9804d).generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.CHANGE_NUMBER_INFO, -1L));
                GeneralInfoDao generalInfoDao2 = ((SplitRoomDatabase) rVar.f9804d).generalInfoDao();
                String strTnTj783 = numX49.tnTj78("PO2");
                String strTnTj784 = numX49.tnTj78("POL");
                generalInfoDao2.update(new GeneralInfoEntity(strTnTj783, strTnTj784));
                ((SplitRoomDatabase) rVar.f9804d).generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.TRAFFIC_TYPES_MAP, strTnTj784));
                ((SplitRoomDatabase) rVar.f9804d).getSplitQueryDao().invalidate();
                ((SplitRoomDatabase) rVar.f9804d).splitDao().deleteAll();
                return;
            case 23:
                try {
                    ((Xh.r) this.f657b).execute();
                    return;
                } catch (Exception e) {
                    AbstractC1414e.o(e, new StringBuilder(numX49.tnTj78("POb")));
                    return;
                }
            case 24:
                try {
                    for (C1783d c1783d : (List) this.f657b) {
                        Ff.f fVarExecute = c1783d.f18138a.execute();
                        ki.e eVar5 = (ki.e) c1783d.f18139b.get();
                        if (eVar5 != null) {
                            eVar5.b(fVarExecute);
                        }
                        break;
                    }
                    return;
                } catch (Exception e7) {
                    AbstractC1414e.o(e7, new StringBuilder(numX49.tnTj78("POP")));
                    return;
                }
            case 25:
                m4.e.a((BarcodeView) ((C1258f0) this.f657b).f11441b);
                return;
            case 26:
                a();
                return;
            case 27:
                C1917a c1917a = (C1917a) ((Xj.d) this.f657b).f6690b;
                c1917a.f18593b = false;
                c1917a.a();
                return;
            case 28:
                RunnableC1918b runnableC1918b = (RunnableC1918b) this.f657b;
                C1922f c1922f = ((C1920d) runnableC1918b.c).c;
                L l6 = (L) runnableC1918b.f18596b;
                Camera camera = c1922f.f18607a;
                if (camera == null || !c1922f.e) {
                    return;
                }
                C1921e c1921e = c1922f.f18612l;
                c1921e.f18605a = l6;
                camera.setOneShotPreviewCallback(c1921e);
                return;
            default:
                C2085j0 c2085j0 = (C2085j0) this.f657b;
                try {
                    c2085j0.f19506a.onComplete();
                    return;
                } finally {
                    c2085j0.f19508d.dispose();
                }
        }
    }

    public h(List list) {
        this.f656a = 24;
        Objects.requireNonNull(list);
        this.f657b = list;
    }
}
