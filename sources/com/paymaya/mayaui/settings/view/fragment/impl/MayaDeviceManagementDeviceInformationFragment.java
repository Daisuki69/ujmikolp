package com.paymaya.mayaui.settings.view.fragment.impl;

import L9.C0327e;
import N5.C0462k;
import O5.a;
import Rb.g;
import S.b;
import S5.c;
import Sb.q;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.DeviceInformation;
import com.paymaya.mayaui.settings.view.activity.impl.MayaDeviceManagementActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaDeviceManagementDeviceInformationFragment extends MayaBaseFragment implements g {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0462k f13954U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f13955V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f13956W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f13957X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f13958Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f13959Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f13960a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f13961b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public C0327e f13962c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public q f13963d0;

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.DEVICE;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f13963d0 = (q) getActivity();
        a aVar = (a) W4.a.e().y().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        C0327e c0327e = new C0327e(9);
        this.f13962c0 = c0327e;
        c0327e.h(this);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        j.g(menu, "menu");
        j.g(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.maya_menu_device_management, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_device_management_device_information, viewGroup, false);
        int i = R.id.barrier_device_information_brand;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_device_information_brand)) != null) {
            i = R.id.barrier_device_information_ip_address;
            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_device_information_ip_address)) != null) {
                i = R.id.barrier_device_information_last_logged_in;
                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_device_information_last_logged_in)) != null) {
                    i = R.id.barrier_device_information_location;
                    if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_device_information_location)) != null) {
                        i = R.id.barrier_device_information_os_version;
                        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_device_information_os_version)) != null) {
                            i = R.id.guide_line_device_information_content;
                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guide_line_device_information_content)) != null) {
                                i = R.id.image_view_change_password_icon;
                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_change_password_icon)) != null) {
                                    NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                    i = R.id.space_change_password_bottom;
                                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_change_password_bottom)) != null) {
                                        i = R.id.space_device_information_bottom;
                                        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_device_information_bottom)) != null) {
                                            i = R.id.text_view_change_password_clickable;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_change_password_clickable);
                                            if (textView != null) {
                                                i = R.id.text_view_change_password_description;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_change_password_description)) != null) {
                                                    i = R.id.text_view_change_password_title;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_change_password_title)) != null) {
                                                        i = R.id.text_view_device_information_brand_label;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_brand_label)) != null) {
                                                            i = R.id.text_view_device_information_brand_value;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_brand_value);
                                                            if (textView2 != null) {
                                                                i = R.id.text_view_device_information_ip_address_label;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_ip_address_label)) != null) {
                                                                    i = R.id.text_view_device_information_ip_address_value;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_ip_address_value);
                                                                    if (textView3 != null) {
                                                                        i = R.id.text_view_device_information_last_logged_in_label;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_last_logged_in_label)) != null) {
                                                                            i = R.id.text_view_device_information_last_logged_in_value;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_last_logged_in_value);
                                                                            if (textView4 != null) {
                                                                                i = R.id.text_view_device_information_location_label;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_location_label)) != null) {
                                                                                    i = R.id.text_view_device_information_location_value;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_location_value);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.text_view_device_information_os_version_label;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_os_version_label)) != null) {
                                                                                            i = R.id.text_view_device_information_os_version_value;
                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_device_information_os_version_value);
                                                                                            if (textView6 != null) {
                                                                                                i = R.id.text_view_title_header;
                                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header);
                                                                                                if (textView7 != null) {
                                                                                                    i = R.id.view_change_password_content;
                                                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_change_password_content);
                                                                                                    if (viewFindChildViewById != null) {
                                                                                                        i = R.id.view_device_information_content;
                                                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_device_information_content);
                                                                                                        if (viewFindChildViewById2 != null) {
                                                                                                            this.f13954U = new C0462k(nestedScrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7, viewFindChildViewById, viewFindChildViewById2);
                                                                                                            j.f(nestedScrollView, "getRoot(...)");
                                                                                                            return nestedScrollView;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f13962c0;
        if (c0327e == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13954U = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        j.g(item, "item");
        if (item.getItemId() != R.id.maya_menu_help_icon) {
            return super.onOptionsItemSelected(item);
        }
        q qVar = this.f13963d0;
        if (qVar != null) {
            ((MayaDeviceManagementActivity) qVar).V1("get_help", EnumC1216e.DEVICE);
        }
        q qVar2 = this.f13963d0;
        if (qVar2 == null) {
            return true;
        }
        MayaDeviceManagementActivity mayaDeviceManagementActivity = (MayaDeviceManagementActivity) qVar2;
        mayaDeviceManagementActivity.n1().v(mayaDeviceManagementActivity, "https://support.maya.ph/s/article/What-can-I-do-with-the-Log-In-History", mayaDeviceManagementActivity.getString(R.string.maya_label_help));
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        j.g(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(R.id.maya_menu_help_icon);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(true);
            Drawable icon = menuItemFindItem.getIcon();
            if (icon != null) {
                icon.setAlpha(255);
            }
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        A1(c1219h);
        m1().n(10);
        q qVar = this.f13963d0;
        if (qVar != null) {
            ((MayaDeviceManagementActivity) qVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0462k c0462k = this.f13954U;
        j.d(c0462k);
        this.f13955V = (TextView) c0462k.f;
        C0462k c0462k2 = this.f13954U;
        j.d(c0462k2);
        this.f13956W = (TextView) c0462k2.j;
        C0462k c0462k3 = this.f13954U;
        j.d(c0462k3);
        this.f13957X = (TextView) c0462k3.i;
        C0462k c0462k4 = this.f13954U;
        j.d(c0462k4);
        this.f13958Y = (TextView) c0462k4.f4132d;
        C0462k c0462k5 = this.f13954U;
        j.d(c0462k5);
        this.f13959Z = (TextView) c0462k5.f4134k;
        C0462k c0462k6 = this.f13954U;
        j.d(c0462k6);
        this.f13960a0 = (TextView) c0462k6.e;
        C0462k c0462k7 = this.f13954U;
        j.d(c0462k7);
        this.f13961b0 = (TextView) c0462k7.c;
        Bundle arguments = getArguments();
        if (arguments != null) {
            DeviceInformation deviceInformation = (DeviceInformation) arguments.getParcelable("device_information");
            C0327e c0327e = this.f13962c0;
            if (c0327e == null) {
                j.n("mFragmentPresenter");
                throw null;
            }
            c0327e.j();
            if (deviceInformation != null) {
                g gVar = (g) c0327e.c.get();
                String modelName = deviceInformation.getModelName();
                MayaDeviceManagementDeviceInformationFragment mayaDeviceManagementDeviceInformationFragment = (MayaDeviceManagementDeviceInformationFragment) gVar;
                mayaDeviceManagementDeviceInformationFragment.getClass();
                j.g(modelName, "modelName");
                TextView textView = mayaDeviceManagementDeviceInformationFragment.f13955V;
                if (textView == null) {
                    j.n("mTextViewTitleHeader");
                    throw null;
                }
                textView.setText(modelName);
                g gVar2 = (g) c0327e.c.get();
                String location = deviceInformation.getLocation();
                MayaDeviceManagementDeviceInformationFragment mayaDeviceManagementDeviceInformationFragment2 = (MayaDeviceManagementDeviceInformationFragment) gVar2;
                mayaDeviceManagementDeviceInformationFragment2.getClass();
                j.g(location, "location");
                TextView textView2 = mayaDeviceManagementDeviceInformationFragment2.f13956W;
                if (textView2 == null) {
                    j.n("mTextViewDeviceInfoLocationValue");
                    throw null;
                }
                textView2.setText(location);
                g gVar3 = (g) c0327e.c.get();
                String strReplace = AbstractC1234x.f11259s.withLocale(AbstractC1234x.l()).print(AbstractC1234x.b(deviceInformation.getLastLoggedIn())).replace("am", "AM").replace("pm", "PM");
                j.f(strReplace, "formatDateMayaDeviceInformationDate(...)");
                MayaDeviceManagementDeviceInformationFragment mayaDeviceManagementDeviceInformationFragment3 = (MayaDeviceManagementDeviceInformationFragment) gVar3;
                mayaDeviceManagementDeviceInformationFragment3.getClass();
                TextView textView3 = mayaDeviceManagementDeviceInformationFragment3.f13957X;
                if (textView3 == null) {
                    j.n("mTextViewDeviceInfoLastLoggedInValue");
                    throw null;
                }
                textView3.setText(strReplace);
                g gVar4 = (g) c0327e.c.get();
                String brand = deviceInformation.getBrand();
                MayaDeviceManagementDeviceInformationFragment mayaDeviceManagementDeviceInformationFragment4 = (MayaDeviceManagementDeviceInformationFragment) gVar4;
                mayaDeviceManagementDeviceInformationFragment4.getClass();
                j.g(brand, "brand");
                TextView textView4 = mayaDeviceManagementDeviceInformationFragment4.f13958Y;
                if (textView4 == null) {
                    j.n("mTextViewDeviceInfoBrandValue");
                    throw null;
                }
                textView4.setText(brand);
                g gVar5 = (g) c0327e.c.get();
                String osVersion = deviceInformation.getOsVersion();
                MayaDeviceManagementDeviceInformationFragment mayaDeviceManagementDeviceInformationFragment5 = (MayaDeviceManagementDeviceInformationFragment) gVar5;
                mayaDeviceManagementDeviceInformationFragment5.getClass();
                j.g(osVersion, "osVersion");
                TextView textView5 = mayaDeviceManagementDeviceInformationFragment5.f13959Z;
                if (textView5 == null) {
                    j.n("mTextViewDeviceInfoOSVersionValue");
                    throw null;
                }
                textView5.setText(osVersion);
                g gVar6 = (g) c0327e.c.get();
                String ipAddress = deviceInformation.getIpAddress();
                MayaDeviceManagementDeviceInformationFragment mayaDeviceManagementDeviceInformationFragment6 = (MayaDeviceManagementDeviceInformationFragment) gVar6;
                mayaDeviceManagementDeviceInformationFragment6.getClass();
                j.g(ipAddress, "ipAddress");
                TextView textView6 = mayaDeviceManagementDeviceInformationFragment6.f13960a0;
                if (textView6 == null) {
                    j.n("mTextViewDeviceInfoIPAddressValue");
                    throw null;
                }
                textView6.setText(ipAddress);
            }
        }
        TextView textView7 = this.f13961b0;
        if (textView7 != null) {
            textView7.setOnClickListener(new b(this, 9));
        } else {
            j.n("mTextViewChangePassword");
            throw null;
        }
    }
}
