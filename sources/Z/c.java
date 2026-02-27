package Z;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import androidx.core.content.res.ResourcesCompat;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView[] f6803b;
    public final CTInboxMessage c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f6804d;

    public c(Context context, d dVar, ImageView[] imageViewArr, CTInboxMessage cTInboxMessage) {
        this.f6802a = context;
        this.f6804d = dVar;
        this.f6803b = imageViewArr;
        this.c = cTInboxMessage;
        imageViewArr[0].setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), R.drawable.ct_selected_dot, null));
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        ImageView[] imageViewArr = this.f6803b;
        CTInboxMessage cTInboxMessage = this.c;
        d dVar = this.f6804d;
        Callback.onPageSelected_enter(i);
        try {
            int length = imageViewArr.length;
            int i4 = 0;
            while (true) {
                Context context = this.f6802a;
                if (i4 >= length) {
                    imageViewArr[i].setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), R.drawable.ct_selected_dot, null));
                    dVar.f6808s.setText(((CTInboxMessageContent) cTInboxMessage.j.get(i)).m);
                    dVar.f6808s.setTextColor(Color.parseColor(((CTInboxMessageContent) cTInboxMessage.j.get(i)).f9572n));
                    dVar.f6809t.setText(((CTInboxMessageContent) cTInboxMessage.j.get(i)).j);
                    dVar.f6809t.setTextColor(Color.parseColor(((CTInboxMessageContent) cTInboxMessage.j.get(i)).f9570k));
                    Callback.onPageSelected_exit();
                    return;
                }
                imageViewArr[i4].setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), R.drawable.ct_unselected_dot, null));
                i4++;
            }
        } catch (Throwable th2) {
            Callback.onPageSelected_exit();
            throw th2;
        }
    }
}
