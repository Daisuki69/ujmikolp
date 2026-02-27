package J8;

import G5.u;
import N5.C0435a;
import N5.X0;
import We.A;
import We.G;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.KycDocumentSample;
import com.paymaya.domain.model.KycDocumentSampleImage;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f2469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f2470b;

    public i(u uVar) {
        C1112C items = C1112C.f9377a;
        kotlin.jvm.internal.j.g(items, "items");
        this.f2469a = items;
        this.f2470b = uVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f2469a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object obj = this.f2469a.get(i);
        if (obj instanceof a) {
            return 0;
        }
        if (obj instanceof KycDocumentSample) {
            return 1;
        }
        throw new IllegalStateException("Invalid view type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z4;
        kotlin.jvm.internal.j.g(holder, "holder");
        if (holder instanceof g) {
            Object obj = this.f2469a.get(i);
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.adapter.HeaderData");
            a aVar = (a) obj;
            X0 x02 = ((g) holder).f2466a;
            x02.f4031d.setText(aVar.f2452a);
            x02.c.setText(aVar.f2453b);
            return;
        }
        if (holder instanceof h) {
            Object obj2 = this.f2469a.get(i);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type com.paymaya.domain.model.KycDocumentSample");
            KycDocumentSample kycDocumentSample = (KycDocumentSample) obj2;
            List list = this.f2469a;
            List listSubList = list.subList(i + 1, list.size());
            boolean z5 = false;
            if ((listSubList instanceof Collection) && listSubList.isEmpty()) {
                z4 = true;
            } else {
                Iterator it = listSubList.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof KycDocumentSample) {
                        z4 = false;
                        break;
                    }
                }
                z4 = true;
            }
            h hVar = (h) holder;
            C0435a c0435a = hVar.f2467a;
            ((TextView) c0435a.f4049g).setText(kycDocumentSample.getVariant());
            String description = kycDocumentSample.getDescription();
            if (description == null) {
                description = "";
            }
            if (description.length() != 0) {
                description = new zj.o("\\\\u([0-9A-Fa-f]{4})").g(AbstractC1213b.M("\\\\(\\s*)u(\\s*)([0-9A-Fa-f]{4})", description, "\\\\u$3"), new Ag.a(19));
            }
            ((HtmlTextView) c0435a.f4048d).setTextHTML(description);
            TextView textView = (TextView) c0435a.f4049g;
            CharSequence text = textView.getText();
            if (text == null || text.length() == 0) {
                textView.setVisibility(8);
            }
            String additionalDescription = kycDocumentSample.getAdditionalDescription();
            HtmlTextView htmlTextView = (HtmlTextView) c0435a.e;
            if (additionalDescription == null || additionalDescription.length() == 0) {
                htmlTextView.setVisibility(8);
            } else {
                htmlTextView.setVisibility(0);
                htmlTextView.setEnableClickableTextListener(true);
                htmlTextView.setOnLinkClickListener(hVar.f2468b);
                htmlTextView.setTextHTML(kycDocumentSample.getAdditionalDescription());
            }
            LinearLayout linearLayout = (LinearLayout) c0435a.c;
            linearLayout.removeAllViews();
            for (KycDocumentSampleImage kycDocumentSampleImage : kycDocumentSample.getImages()) {
                View viewInflate = LayoutInflater.from(((LinearLayout) c0435a.f4047b).getContext()).inflate(R.layout.maya_item_id_guide_sample_image, linearLayout, z5);
                int i4 = R.id.image_sample;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_sample);
                if (imageView != null) {
                    i4 = R.id.text_view_instruction;
                    HtmlTextView htmlTextView2 = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_instruction);
                    if (htmlTextView2 != null) {
                        LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                        String instruction = kycDocumentSampleImage.getInstruction();
                        if (instruction == null) {
                            instruction = "";
                        }
                        if (instruction.length() != 0) {
                            instruction = new zj.o("\\\\u([0-9A-Fa-f]{4})").g(AbstractC1213b.M("\\\\(\\s*)u(\\s*)([0-9A-Fa-f]{4})", instruction, "\\\\u$3"), new Ag.a(19));
                        }
                        htmlTextView2.setTextHTML(instruction);
                        String instruction2 = kycDocumentSampleImage.getInstruction();
                        htmlTextView2.setVisibility((instruction2 == null || instruction2.length() == 0) ? 8 : 0);
                        String url = kycDocumentSampleImage.getUrl();
                        if (url != null && !C2576A.H(url)) {
                            G gH = A.d().h(url);
                            gH.h(R.drawable.maya_id_loading_placeholder);
                            gH.f(2);
                            gH.g(2);
                            F8.b bVar = new F8.b(imageView, 1);
                            imageView.setTag(R.id.image_load_target, bVar);
                            gH.d(bVar);
                        }
                        linearLayout.addView(linearLayout2);
                        z5 = false;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
            }
            c0435a.f.setVisibility(z4 ? 8 : 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.j.g(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.maya_item_id_guide_header, parent, false);
            int i4 = R.id.text_view_subtitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_subtitle);
            if (textView != null) {
                i4 = R.id.text_view_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title);
                if (textView2 != null) {
                    return new g(new X0((LinearLayout) viewInflate, textView, textView2, 0));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
        }
        if (i != 1) {
            throw new IllegalStateException("Unknown view type");
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.maya_item_id_guide_sample, parent, false);
        int i6 = R.id.linear_layout_images;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate2, R.id.linear_layout_images);
        if (linearLayout != null) {
            i6 = R.id.text_view_description;
            HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate2, R.id.text_view_description);
            if (htmlTextView != null) {
                i6 = R.id.text_view_description_secondary;
                HtmlTextView htmlTextView2 = (HtmlTextView) ViewBindings.findChildViewById(viewInflate2, R.id.text_view_description_secondary);
                if (htmlTextView2 != null) {
                    i6 = R.id.text_view_variant;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.text_view_variant);
                    if (textView3 != null) {
                        i6 = R.id.view_sample_divider;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate2, R.id.view_sample_divider);
                        if (viewFindChildViewById != null) {
                            return new h(new C0435a((ViewGroup) viewInflate2, (View) linearLayout, (View) htmlTextView, (TextView) htmlTextView2, textView3, viewFindChildViewById, 17), this.f2470b);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i6)));
    }
}
