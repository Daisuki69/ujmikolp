package a7;

import N5.r1;
import android.content.IntentSender;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.ComponentActivity$activityResultRegistry$1;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.profileinstaller.DeviceProfileWriter;
import com.paymaya.mayaui.common.view.widget.MayaStaticToolTipView;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: a7.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0661v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7062b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7063d;

    public /* synthetic */ RunnableC0661v(Object obj, int i, Object obj2, int i4) {
        this.f7061a = i4;
        this.c = obj;
        this.f7062b = i;
        this.f7063d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i4;
        Object obj = this.f7063d;
        int i6 = this.f7062b;
        Object obj2 = this.c;
        switch (this.f7061a) {
            case 0:
                int i10 = MayaStaticToolTipView.i;
                MayaStaticToolTipView mayaStaticToolTipView = (MayaStaticToolTipView) obj2;
                mayaStaticToolTipView.measure(0, 0);
                int measuredWidth = mayaStaticToolTipView.getMeasuredWidth();
                int measuredHeight = mayaStaticToolTipView.getMeasuredHeight();
                int[] iArr = new int[2];
                View view = (View) obj;
                view.getLocationOnScreen(iArr);
                int i11 = iArr[0];
                int i12 = iArr[1];
                int width = view.getWidth();
                int height = view.getHeight();
                int[] iArr2 = new int[2];
                Object parent = mayaStaticToolTipView.getParent();
                kotlin.jvm.internal.j.e(parent, "null cannot be cast to non-null type android.view.View");
                ((View) parent).getLocationOnScreen(iArr2);
                int i13 = ((width / 2) + i11) - iArr2[0];
                Object parent2 = mayaStaticToolTipView.getParent();
                kotlin.jvm.internal.j.e(parent2, "null cannot be cast to non-null type android.view.View");
                int i14 = measuredWidth / 2;
                int iB = kotlin.ranges.d.b(i13 - i14, 16, (((View) parent2).getWidth() - measuredWidth) - 16);
                mayaStaticToolTipView.setX(iB);
                if (i6 == 1) {
                    i = (i12 - measuredHeight) - 8;
                    i4 = iArr2[1];
                } else {
                    i = i12 + height + 8;
                    i4 = iArr2[1];
                }
                mayaStaticToolTipView.setY(i - i4);
                r1 r1Var = mayaStaticToolTipView.h;
                ImageView imageView = i6 == 1 ? (ImageView) r1Var.f4199d : (ImageView) r1Var.e;
                imageView.measure(0, 0);
                int i15 = i13 - iB;
                int measuredWidth2 = (i14 - (imageView.getMeasuredWidth() / 2)) - 8;
                if (measuredWidth2 < 0) {
                    measuredWidth2 = 0;
                }
                imageView.setTranslationX(kotlin.ranges.d.b(i15 - i14, -measuredWidth2, measuredWidth2));
                mayaStaticToolTipView.setVisibility(0);
                break;
            case 1:
                ComponentActivity$activityResultRegistry$1.onLaunch$lambda$0((ComponentActivity$activityResultRegistry$1) obj2, i6, (ActivityResultContract.SynchronousResult) obj);
                break;
            case 2:
                ComponentActivity$activityResultRegistry$1.onLaunch$lambda$1((ComponentActivity$activityResultRegistry$1) obj2, i6, (IntentSender.SendIntentException) obj);
                break;
            case 3:
                ListenerSet.lambda$queueEvent$0((CopyOnWriteArraySet) obj2, i6, (ListenerSet.Event) obj);
                break;
            case 4:
                ((DrmSessionEventListener.EventDispatcher) obj2).lambda$drmSessionAcquired$0((DrmSessionEventListener) obj, i6);
                break;
            case 5:
                ((DeviceProfileWriter) obj2).lambda$result$0(i6, obj);
                break;
            default:
                ((com.tencent.could.huiyansdk.fragments.f) obj2).a(i6, (String) obj);
                break;
        }
    }

    public /* synthetic */ RunnableC0661v(Object obj, Object obj2, int i, int i4) {
        this.f7061a = i4;
        this.c = obj;
        this.f7063d = obj2;
        this.f7062b = i;
    }
}
