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
public final class d extends k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RelativeLayout f6805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CTCarouselViewPager f6806q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinearLayout f6807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f6808s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f6809t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f6810u;

    public d(View view) {
        super(view);
        this.f6806q = (CTCarouselViewPager) view.findViewById(R.id.image_carousel_viewpager);
        this.f6807r = (LinearLayout) view.findViewById(R.id.sliderDots);
        this.f6808s = (TextView) view.findViewById(R.id.messageTitle);
        this.f6809t = (TextView) view.findViewById(R.id.messageText);
        this.f6810u = (TextView) view.findViewById(R.id.timestamp);
        this.f6805p = (RelativeLayout) view.findViewById(R.id.body_linear_layout);
    }

    @Override // Z.k
    public final void E(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i) {
        super.E(cTInboxMessage, cTInboxListViewFragment, i);
        CTInboxListViewFragment cTInboxListViewFragment2 = (CTInboxListViewFragment) this.m.get();
        Context applicationContext = cTInboxListViewFragment.getActivity().getApplicationContext();
        ArrayList arrayList = cTInboxMessage.j;
        CTInboxMessageContent cTInboxMessageContent = (CTInboxMessageContent) arrayList.get(0);
        TextView textView = this.f6808s;
        textView.setVisibility(0);
        TextView textView2 = this.f6809t;
        textView2.setVisibility(0);
        textView.setText(cTInboxMessageContent.m);
        textView.setTextColor(Color.parseColor(cTInboxMessageContent.f9572n));
        textView2.setText(cTInboxMessageContent.j);
        textView2.setTextColor(Color.parseColor(cTInboxMessageContent.f9570k));
        boolean z4 = cTInboxMessage.f9560k;
        ImageView imageView = this.f6837o;
        if (z4) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        TextView textView3 = this.f6810u;
        textView3.setVisibility(0);
        textView3.setText(k.D(cTInboxMessage.f9559g));
        textView3.setTextColor(Color.parseColor(cTInboxMessageContent.f9572n));
        int color = Color.parseColor(cTInboxMessage.f9557b);
        RelativeLayout relativeLayout = this.f6805p;
        relativeLayout.setBackgroundColor(color);
        CTCarouselViewPager cTCarouselViewPager = this.f6806q;
        cTCarouselViewPager.setAdapter(new f(applicationContext, cTInboxListViewFragment, cTInboxMessage, (LinearLayout.LayoutParams) cTCarouselViewPager.getLayoutParams(), i));
        int size = arrayList.size();
        LinearLayout linearLayout = this.f6807r;
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        ImageView[] imageViewArr = new ImageView[size];
        k.J(imageViewArr, size, applicationContext, linearLayout);
        imageViewArr[0].setImageDrawable(ResourcesCompat.getDrawable(applicationContext.getResources(), R.drawable.ct_selected_dot, null));
        cTCarouselViewPager.addOnPageChangeListener(new c(cTInboxListViewFragment.getActivity().getApplicationContext(), this, imageViewArr, cTInboxMessage));
        relativeLayout.setOnClickListener(new l(i, cTInboxMessage, cTInboxListViewFragment2, cTCarouselViewPager));
        I(cTInboxMessage, i);
    }
}
