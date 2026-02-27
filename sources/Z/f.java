package Z;

import D.S;
import D.d0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.PagerAdapter;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.paymaya.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends PagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6814b;
    public final CTInboxMessage c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout.LayoutParams f6815d;
    public final WeakReference e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f6816g;

    public f(Context context, CTInboxListViewFragment cTInboxListViewFragment, CTInboxMessage cTInboxMessage, LinearLayout.LayoutParams layoutParams, int i) {
        this.f6814b = context;
        this.e = new WeakReference(cTInboxListViewFragment);
        cTInboxMessage.getClass();
        ArrayList arrayList = new ArrayList();
        for (CTInboxMessageContent cTInboxMessageContent : cTInboxMessage.j) {
            arrayList.add(new q(cTInboxMessageContent.h, cTInboxMessageContent.i));
        }
        this.f6813a = arrayList;
        this.f6815d = layoutParams;
        this.c = cTInboxMessage;
        this.f = i;
    }

    public final void a(ImageView imageView, View view, int i, ViewGroup viewGroup) {
        imageView.setVisibility(0);
        ArrayList arrayList = this.f6813a;
        String str = ((q) arrayList.get(i)).f6852b;
        boolean zIsEmpty = str.isEmpty();
        Context context = this.f6814b;
        if (zIsEmpty) {
            str = context.getString(R.string.ct_inbox_image_content_description) + (i + 1);
        }
        imageView.setContentDescription(str);
        try {
            Glide.with(imageView.getContext()).load(((q) arrayList.get(i)).f6851a).apply(new RequestOptions().placeholder(d0.h(context, "ct_image")).error(d0.h(context, "ct_image"))).into(imageView);
        } catch (NoSuchMethodError unused) {
            S.b("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
            Glide.with(imageView.getContext()).load(((q) arrayList.get(i)).f6851a).into(imageView);
        }
        viewGroup.addView(view, this.f6815d);
        view.setOnClickListener(new e(this, i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f6813a.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        CTInboxMessage cTInboxMessage = this.c;
        this.f6816g = ((LayoutInflater) this.f6814b.getSystemService("layout_inflater")).inflate(R.layout.inbox_carousel_image_layout, viewGroup, false);
        try {
            if (cTInboxMessage.m.equalsIgnoreCase(CmcdData.Factory.STREAM_TYPE_LIVE)) {
                a((ImageView) this.f6816g.findViewById(R.id.imageView), this.f6816g, i, viewGroup);
            } else if (cTInboxMessage.m.equalsIgnoreCase(TtmlNode.TAG_P)) {
                a((ImageView) this.f6816g.findViewById(R.id.squareImageView), this.f6816g, i, viewGroup);
            }
        } catch (NoClassDefFoundError unused) {
            S.b("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
        }
        return this.f6816g;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
