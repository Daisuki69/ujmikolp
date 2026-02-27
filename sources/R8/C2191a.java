package r8;

import N5.C0440b1;
import N5.C0452f1;
import We.s;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.InboxItem;
import com.paymaya.domain.model.InboxMessage;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxPageFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import o6.f;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.Weeks;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.PeriodFormatterBuilder;
import u8.C2305a;
import u8.C2307c;

/* JADX INFO: renamed from: r8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2191a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MayaInboxPageFragment f19879b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f19880d = new ArrayList();
    public final LayoutInflater e;

    public C2191a(Context context, MayaInboxPageFragment mayaInboxPageFragment, String str) {
        this.f19878a = context;
        this.f19879b = mayaInboxPageFragment;
        this.c = str;
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.e = (LayoutInflater) systemService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f19880d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((InboxItem) this.f19880d.get(i)).getViewType().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        String date;
        j.g(holder, "holder");
        if (!(holder instanceof C2307c)) {
            if (holder instanceof C2305a) {
                C2305a c2305a = (C2305a) holder;
                c2305a.f20274b.c.setText(c2305a.f20273a);
                return;
            }
            return;
        }
        final C2307c c2307c = (C2307c) holder;
        ArrayList arrayList = this.f19880d;
        Object obj = arrayList.get(i);
        j.e(obj, "null cannot be cast to non-null type com.paymaya.domain.model.InboxMessage");
        InboxMessage inboxMessage = (InboxMessage) obj;
        final boolean z4 = i == 1;
        final boolean z5 = i == arrayList.size() - 1;
        c2307c.e = inboxMessage;
        f fVar = c2307c.f20279d;
        if (fVar != null) {
            boolean zIsRead = inboxMessage.isRead();
            C2307c c2307c2 = (C2307c) fVar.f18793b;
            C0440b1 c0440b1 = c2307c2.c;
            if (zIsRead) {
                c2307c2.E(z4, z5);
            } else {
                c0440b1.f.setVisibility(0);
                Context context = c2307c2.f20277a;
                c0440b1.c.setBackground(z4 ? ContextCompat.getDrawable(context, R.drawable.maya_bg_inbox_undread_first) : z5 ? ContextCompat.getDrawable(context, R.drawable.maya_bg_inbox_undread_last) : ContextCompat.getDrawable(context, R.drawable.maya_bg_inbox_undread));
            }
            String title = inboxMessage.mTitle();
            j.g(title, "title");
            c0440b1.f4064g.setText(title);
            DateTime dateTimeMDate = inboxMessage.mDate();
            DateTimeFormatter dateTimeFormatter = AbstractC1234x.f11248a;
            Period period = new Period(dateTimeMDate, DateTime.now());
            if (new Interval(DateTime.now().minusHours(1), Hours.ONE).contains(dateTimeMDate)) {
                date = new PeriodFormatterBuilder().printZeroNever().appendMinutes().appendSuffix("m").toFormatter().print(period);
            } else if (new Interval(DateTime.now().minusDays(1), Days.ONE).contains(dateTimeMDate)) {
                date = new PeriodFormatterBuilder().printZeroNever().appendHours().appendSuffix(CmcdData.Factory.STREAMING_FORMAT_HLS).toFormatter().print(period);
            } else if (new Interval(DateTime.now().minusWeeks(1), Weeks.ONE).contains(dateTimeMDate)) {
                date = new PeriodFormatterBuilder().printZeroNever().appendDays().appendSuffix("d").toFormatter().print(period);
            } else {
                date = Weeks.weeksBetween(dateTimeMDate, DateTime.now()).getWeeks() + "w";
            }
            j.g(date, "date");
            c0440b1.f4063d.setText(date);
            String message = inboxMessage.mMessage();
            j.g(message, "message");
            c0440b1.e.setText(message);
        }
        c2307c.c.c.setOnClickListener(new View.OnClickListener() { // from class: u8.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2307c c2307c3 = c2307c;
                boolean z8 = z4;
                boolean z9 = z5;
                Callback.onClick_enter(view);
                try {
                    C2307c.D(c2307c3, z8, z9);
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        int value = InboxItem.VIEW_TYPE.VIEW_TYPE_ITEM.getValue();
        LayoutInflater layoutInflater = this.e;
        if (i != value) {
            if (i != InboxItem.VIEW_TYPE.VIEW_TYPE_HEADER.getValue()) {
                throw new PayMayaRuntimeException(s.f(i, "Invalid view type : "));
            }
            View viewInflate = layoutInflater.inflate(R.layout.maya_view_holder_inbox_header, parent, false);
            if (viewInflate == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView = (TextView) viewInflate;
            return new C2305a(new C0452f1(textView, textView, 2), this.c);
        }
        View viewInflate2 = layoutInflater.inflate(R.layout.maya_view_holder_inbox_item, parent, false);
        int i4 = R.id.inbox_item_barrier;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate2, R.id.inbox_item_barrier)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2;
            i4 = R.id.inbox_item_date_text_view;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.inbox_item_date_text_view);
            if (textView2 != null) {
                i4 = R.id.inbox_item_description_text_view;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.inbox_item_description_text_view);
                if (textView3 != null) {
                    i4 = R.id.inbox_item_green_dot_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.inbox_item_green_dot_image);
                    if (imageView != null) {
                        i4 = R.id.inbox_item_icon;
                        if (((ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.inbox_item_icon)) != null) {
                            i4 = R.id.inbox_item_title_text_view;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.inbox_item_title_text_view);
                            if (textView4 != null) {
                                return new C2307c(new C0440b1(constraintLayout, constraintLayout, textView2, textView3, imageView, textView4), this.f19878a, this.f19879b);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i4)));
    }
}
