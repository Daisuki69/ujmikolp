package Ob;

import G6.w;
import L6.ViewOnClickListenerC0318d;
import N5.l1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.DeviceInformation;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDeviceManagementMainFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaDeviceManagementMainFragment f4788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4789b = new ArrayList();

    public a(MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment) {
        this.f4788a = mayaDeviceManagementMainFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4789b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Tb.a holder = (Tb.a) viewHolder;
        j.g(holder, "holder");
        DeviceInformation device = (DeviceInformation) this.f4789b.get(i);
        j.g(device, "device");
        w wVar = holder.f5821g;
        wVar.getClass();
        String modelName = device.getModelName();
        Tb.a aVar = (Tb.a) wVar.f1822b;
        j.g(modelName, "modelName");
        aVar.f5820d.setText(modelName);
        String platform = device.getPlatformLowercase();
        j.g(platform, "platform");
        boolean zEquals = platform.equals("android");
        TextView textView = aVar.c;
        Context context = aVar.f5819b;
        if (zEquals) {
            textView.setText(context.getString(R.string.maya_label_device_management_platform_android));
        } else if (platform.equals(DeviceInformation.PLATFORM_IOS)) {
            textView.setText(context.getString(R.string.maya_label_device_management_platform_ios));
        } else {
            textView.setText(context.getString(R.string.maya_label_device_management_platform_unknown));
        }
        String strReplace = AbstractC1234x.f11259s.withLocale(AbstractC1234x.l()).print(AbstractC1234x.b(device.getLastLoggedIn())).replace("am", "AM").replace("pm", "PM");
        j.f(strReplace, "formatDateMayaDeviceInformationDate(...)");
        aVar.e.setText(strReplace);
        String dateTime = device.getLocation();
        j.g(dateTime, "dateTime");
        aVar.f.setText(dateTime);
        holder.itemView.setOnClickListener(new ViewOnClickListenerC0318d(holder, i, device, 4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.maya_view_holder_device_information, parent, false);
        int i4 = R.id.image_view_device_information_arrow;
        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_device_information_arrow)) != null) {
            i4 = R.id.text_view_device_information_icon;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_icon);
            if (textView != null) {
                i4 = R.id.text_view_device_information_last_logged_in;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_last_logged_in);
                if (textView2 != null) {
                    i4 = R.id.text_view_device_information_location;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_location);
                    if (textView3 != null) {
                        i4 = R.id.text_view_device_information_name;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_name);
                        if (textView4 != null) {
                            return new Tb.a(new l1((ConstraintLayout) viewInflate, textView, textView2, textView3, textView4, 1), this.f4788a);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
