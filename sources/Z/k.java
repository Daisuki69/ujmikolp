package Z;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.paymaya.R;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f6831b;
    public LinearLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FrameLayout f6832d;
    public ImageView e;
    public ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f6833g;
    public FrameLayout h;
    public RelativeLayout i;
    public CTInboxMessageContent j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CTInboxMessage f6834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f6835l;
    public WeakReference m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f6837o;

    public k(View view) {
        super(view);
        this.f6837o = (ImageView) view.findViewById(R.id.read_circle);
    }

    public static String D(long j) {
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - j;
        if (jCurrentTimeMillis < 60) {
            return "Just Now";
        }
        if (jCurrentTimeMillis > 60 && jCurrentTimeMillis < 3540) {
            return We.s.h(jCurrentTimeMillis / 60, " mins ago", new StringBuilder());
        }
        if (jCurrentTimeMillis <= 3540 || jCurrentTimeMillis >= 81420) {
            return (jCurrentTimeMillis <= 86400 || jCurrentTimeMillis >= 172800) ? new SimpleDateFormat("dd MMM").format(new Date(j * 1000)) : "Yesterday";
        }
        long j6 = jCurrentTimeMillis / 3600;
        if (j6 > 1) {
            return j6 + " hours ago";
        }
        return j6 + " hour ago";
    }

    public static void F(Button button, Button button2, Button button3) {
        button3.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 3.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 3.0f));
        button3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    public static void G(Button button, Button button2, Button button3) {
        button2.setVisibility(8);
        button3.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 6.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
        button3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    public static void J(ImageView[] imageViewArr, int i, Context context, LinearLayout linearLayout) {
        for (int i4 = 0; i4 < i; i4++) {
            ImageView imageView = new ImageView(context);
            imageViewArr[i4] = imageView;
            imageView.setVisibility(0);
            imageViewArr[i4].setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), R.drawable.ct_unselected_dot, null));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(8, 6, 4, 6);
            layoutParams.gravity = 17;
            if (linearLayout.getChildCount() < i) {
                linearLayout.addView(imageViewArr[i4], layoutParams);
            }
        }
    }

    public static void K(ImageView imageView, Context context, float f) {
        boolean z4 = f <= 0.0f;
        int i = z4 ? R.drawable.ct_volume_off : R.drawable.ct_volume_on;
        imageView.setContentDescription(context.getString(z4 ? R.string.ct_inbox_mute_button_content_description : R.string.ct_inbox_unmute_button_content_description));
        imageView.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), i, null));
    }

    public void E(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i) {
        this.f6830a = cTInboxListViewFragment.getContext();
        this.m = new WeakReference(cTInboxListViewFragment);
        this.f6834k = cTInboxMessage;
        CTInboxMessageContent cTInboxMessageContent = (CTInboxMessageContent) cTInboxMessage.j.get(0);
        this.j = cTInboxMessageContent;
        this.f6836n = cTInboxMessageContent.i() || cTInboxMessageContent.l();
    }

    public final void I(CTInboxMessage cTInboxMessage, int i) {
        new Handler().postDelayed(new j(this, i, cTInboxMessage), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }
}
