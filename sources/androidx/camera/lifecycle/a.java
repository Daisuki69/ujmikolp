package androidx.camera.lifecycle;

import Ah.p;
import B5.i;
import Bj.K;
import Ch.f;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.view.MenuItem;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.core.CameraX;
import androidx.collection.ArrayMap;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.FragmentResultListener;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.work.WorkerKt;
import b2.C0859a;
import ba.u;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.GuardedEventDispatcher;
import com.dynatrace.android.agent.data.Session;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.messaging.h;
import com.paymaya.common.utility.g0;
import com.paymaya.common.utility.h0;
import com.paymaya.data.database.repository.C1242f;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.FavoriteStatus;
import com.paymaya.domain.model.MayaChoicesAdapterItem;
import com.paymaya.domain.store.C1269l;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsConfirmationFragment;
import com.paymaya.ui.dashboard.view.fragment.impl.UserActivityFragment;
import ga.d;
import gd.InterfaceC1517a;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements CallbackToFutureAdapter.Resolver, ListenerSet.Event, ListenerSet.IterationFinishedEvent, DefaultTrackSelector.TrackInfo.Factory, NavigationView.OnNavigationItemSelectedListener, Consumer, B2.a, Ch.a, GuardedEventDispatcher.GuardedOperation, OnCompleteListener, Continuation, f, Ch.c, b2.c, g0, FragmentResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7638b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f7637a = i;
        this.f7638b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // androidx.window.extensions.core.util.function.Consumer, Ch.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.a.accept(java.lang.Object):void");
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        C1269l c1269l = (C1269l) this.f7638b;
        C1242f c1242f = c1269l.f11457b;
        c1242f.f11308a.b("bank", "", null);
        c1242f.b((List) obj);
        c1269l.f11458d.f11330b.edit().putString("key_bank_head_date", (String) this.c).apply();
        return p.c(Boolean.TRUE);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f7637a) {
            case 0:
                return ProcessCameraProvider.getOrCreateCameraXInstance$lambda$18$lambda$17((ProcessCameraProvider) this.f7638b, (CameraX) this.c, completer);
            case 15:
                return CoroutineAdapterKt.asListenableFuture$lambda$0((K) this.f7638b, this.c, completer);
            default:
                return WorkerKt.future$lambda$2((Executor) this.f7638b, (Function0) this.c, completer);
        }
    }

    @Override // com.paymaya.common.utility.g0
    public void b(File file) {
        UserActivityFragment userActivityFragment = (UserActivityFragment) this.f7638b;
        InterfaceC1517a interfaceC1517a = userActivityFragment.f14468V;
        Uri uriC = h0.c(userActivityFragment.getActivity(), file);
        MayaTransactionsActivity mayaTransactionsActivity = (MayaTransactionsActivity) interfaceC1517a;
        mayaTransactionsActivity.n1();
        i.D(mayaTransactionsActivity, null, (String) this.c, uriC);
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        switch (this.f7637a) {
            case 12:
                return DefaultTrackSelector.lambda$selectVideoTrack$1((DefaultTrackSelector.Parameters) this.f7638b, (int[]) this.c, i, trackGroup, iArr);
            default:
                return DefaultTrackSelector.lambda$selectTextTrack$3((DefaultTrackSelector.Parameters) this.f7638b, (String) this.c, i, trackGroup, iArr);
        }
    }

    @Override // B2.a
    public void d(B2.b bVar) {
        ((B2.a) this.f7638b).d(bVar);
        ((B2.a) this.c).d(bVar);
    }

    @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
    public void execute(RumEventDispatcher rumEventDispatcher) {
        Core.lambda$sendSessionPropertyEvent$3((Session) this.f7638b, (JSONObject) this.c, rumEventDispatcher);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7637a) {
            case 1:
                analyticsListener.onPlaybackParametersChanged((AnalyticsListener.EventTime) this.f7638b, (PlaybackParameters) this.c);
                break;
            case 2:
                analyticsListener.onAvailableCommandsChanged((AnalyticsListener.EventTime) this.f7638b, (Player.Commands) this.c);
                break;
            case 3:
            default:
                analyticsListener.onTrackSelectionParametersChanged((AnalyticsListener.EventTime) this.f7638b, (TrackSelectionParameters) this.c);
                break;
            case 4:
                analyticsListener.onAudioAttributesChanged((AnalyticsListener.EventTime) this.f7638b, (AudioAttributes) this.c);
                break;
            case 5:
                analyticsListener.onMetadata((AnalyticsListener.EventTime) this.f7638b, (Metadata) this.c);
                break;
            case 6:
                analyticsListener.onTracksChanged((AnalyticsListener.EventTime) this.f7638b, (Tracks) this.c);
                break;
            case 7:
                analyticsListener.onCues((AnalyticsListener.EventTime) this.f7638b, (List<Cue>) this.c);
                break;
            case 8:
                analyticsListener.onDeviceInfoChanged((AnalyticsListener.EventTime) this.f7638b, (DeviceInfo) this.c);
                break;
            case 9:
                DefaultAnalyticsCollector.lambda$onVideoSizeChanged$58((AnalyticsListener.EventTime) this.f7638b, (VideoSize) this.c, analyticsListener);
                break;
            case 10:
                analyticsListener.onCues((AnalyticsListener.EventTime) this.f7638b, (CueGroup) this.c);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((h) this.f7638b).a((Intent) this.c);
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        String itemAsString;
        j.g(str, "<unused var>");
        j.g(bundle, "bundle");
        MayaChoicesAdapterItem mayaChoicesAdapterItem = (MayaChoicesAdapterItem) bundle.getParcelable("model_values");
        Ci.b bVar = ((MayaPayBillsBIRFragment) this.f7638b).f13389J0;
        if (bVar == null) {
            j.n("mMayaPayBillsUIComponentBuilder");
            throw null;
        }
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((HashMap) bVar.f).get((String) this.c);
        if (mayaInputLayout != null) {
            AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
            if (mayaChoicesAdapterItem == null || (itemAsString = mayaChoicesAdapterItem.getItemAsString()) == null) {
                itemAsString = "";
            }
            inputEditText.setText(itemAsString);
        }
    }

    @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        return NavigationUI.m125setupWithNavController$lambda3((NavController) this.f7638b, (NavigationView) this.c, menuItem);
    }

    @Override // Ch.a
    public void run() {
        u uVar = (u) this.f7638b;
        BillerTransaction billerTransaction = (BillerTransaction) this.c;
        uVar.getClass();
        j.g(billerTransaction, "billerTransaction");
        MayaPayBillsConfirmationFragment mayaPayBillsConfirmationFragment = (MayaPayBillsConfirmationFragment) ((d) uVar.c.get());
        mayaPayBillsConfirmationFragment.getClass();
        ha.p pVar = mayaPayBillsConfirmationFragment.f13411e0;
        if (pVar != null) {
            ((MayaPayBillsActivity) pVar).Z1(billerTransaction, mayaPayBillsConfirmationFragment.I1(), FavoriteStatus.FAVORITE_UPDATE_SUCCESS);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        com.google.firebase.messaging.i iVar = (com.google.firebase.messaging.i) this.f7638b;
        String str = (String) this.c;
        synchronized (iVar) {
            ((ArrayMap) iVar.f9786b).remove(str);
        }
        return task;
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        String str = (String) this.f7638b;
        C0859a c0859a = (C0859a) this.c;
        try {
            Trace.beginSection(str);
            return c0859a.f.v(bVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((DefaultAnalyticsCollector) this.f7638b).lambda$setPlayer$1((Player) this.c, (AnalyticsListener) obj, flagSet);
    }
}
