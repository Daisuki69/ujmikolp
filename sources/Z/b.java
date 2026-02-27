package Z;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.clevertap.android.sdk.inbox.CTCarouselViewPager;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.paymaya.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f6798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RelativeLayout f6799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CTCarouselViewPager f6800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinearLayout f6801s;

    public b(View view) {
        super(view);
        this.f6800r = (CTCarouselViewPager) view.findViewById(R.id.image_carousel_viewpager);
        this.f6801s = (LinearLayout) view.findViewById(R.id.sliderDots);
        this.f6798p = (TextView) view.findViewById(R.id.carousel_timestamp);
        this.f6799q = (RelativeLayout) view.findViewById(R.id.body_linear_layout);
    }

    @Override // Z.k
    public final void E(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i) {
        super.E(cTInboxMessage, cTInboxListViewFragment, i);
        CTInboxListViewFragment cTInboxListViewFragment2 = (CTInboxListViewFragment) this.m.get();
        Context applicationContext = cTInboxListViewFragment.getActivity().getApplicationContext();
        ArrayList arrayList = cTInboxMessage.j;
        CTInboxMessageContent cTInboxMessageContent = (CTInboxMessageContent) arrayList.get(0);
        TextView textView = this.f6798p;
        textView.setVisibility(0);
        boolean z4 = cTInboxMessage.f9560k;
        ImageView imageView = this.f6837o;
        if (z4) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        textView.setText(k.D(cTInboxMessage.f9559g));
        textView.setTextColor(Color.parseColor(cTInboxMessageContent.f9572n));
        int color = Color.parseColor(cTInboxMessage.f9557b);
        RelativeLayout relativeLayout = this.f6799q;
        relativeLayout.setBackgroundColor(color);
        CTCarouselViewPager cTCarouselViewPager = this.f6800r;
        cTCarouselViewPager.setAdapter(new f(applicationContext, cTInboxListViewFragment, cTInboxMessage, (LinearLayout.LayoutParams) cTCarouselViewPager.getLayoutParams(), i));
        int size = arrayList.size();
        LinearLayout linearLayout = this.f6801s;
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        ImageView[] imageViewArr = new ImageView[size];
        k.J(imageViewArr, size, applicationContext, linearLayout);
        imageViewArr[0].setImageDrawable(ResourcesCompat.getDrawable(applicationContext.getResources(), R.drawable.ct_selected_dot, null));
        cTCarouselViewPager.addOnPageChangeListener(new a(cTInboxListViewFragment.getActivity().getApplicationContext(), imageViewArr));
        relativeLayout.setOnClickListener(new l(i, cTInboxMessage, cTInboxListViewFragment2, cTCarouselViewPager));
        I(cTInboxMessage, i);
    }
}
