package He;

import android.view.View;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.paymaya.ui.travel.view.fragment.impl.TravelTicketFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TravelTicketFragment f2166b;

    public /* synthetic */ d(TravelTicketFragment travelTicketFragment, int i) {
        this.f2165a = i;
        this.f2166b = travelTicketFragment;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f2165a) {
            case 0:
                this.f2166b.onImageClicked((ImageView) Utils.castParam(view, "doClick", 0, "onImageClicked", 0, ImageView.class));
                break;
            case 1:
                this.f2166b.onShareClicked();
                break;
            case 2:
                this.f2166b.onSaveClicked();
                break;
            default:
                this.f2166b.onDoneClicked();
                break;
        }
    }
}
