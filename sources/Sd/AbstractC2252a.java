package sd;

import F7.i;
import We.s;
import a7.C0633A;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.ActivityDescription;
import com.paymaya.domain.model.Contact;
import com.paymaya.domain.model.Fee;
import com.paymaya.domain.model.TotalAmount;
import com.paymaya.domain.model.TransferPersonalizationMeta;
import com.paymaya.domain.model.UserActivity;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import y5.u;
import y5.v;
import yd.InterfaceC2528a;
import zj.C2576A;

/* JADX INFO: renamed from: sd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC2252a extends AbstractC2509a implements u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2252a(S5.c cVar, int i) {
        super(null);
        j.g(cVar, numX49.tnTj78("bFGP"));
    }

    public static String p(String str) {
        Contact contactC;
        J5.c cVarD = J5.c.d();
        String strMName = (cVarD == null || (contactC = cVarD.c(str)) == null) ? null : contactC.mName();
        return (strMName == null || strMName.length() == 0) ? str : strMName;
    }

    public boolean k(C0633A c0633a, Fee fee) {
        if (fee == null) {
            return false;
        }
        String string = ((MayaAbstractBaseUserActivityFragmentImpl) ((i) this.c.get())).getString(R.string.maya_label_convenience_fee);
        j.f(string, numX49.tnTj78("bFGb"));
        String strMLabel = fee.mLabel();
        String strI = s.i(((MayaAbstractBaseUserActivityFragmentImpl) ((i) this.c.get())).K1(), fee.getFormattedValue());
        String strMValue = fee.mValue();
        return C0633A.a(c0633a, string, strMLabel, strI, !(strMValue == null || C2576A.H(strMValue)), null, 16);
    }

    public C0633A l(UserActivity userActivity) {
        C0633A c0633a = new C0633A();
        C0633A.d(c0633a, new boolean[]{k(c0633a, userActivity.mFee()), n(c0633a, userActivity.mTotalAmount())});
        C0633A.d(c0633a, new boolean[]{m(c0633a, userActivity.getParsedReferenceNoWithSpaces())});
        return c0633a;
    }

    public boolean m(C0633A c0633a, String str) {
        return C0633A.c(c0633a, ((MayaAbstractBaseUserActivityFragmentImpl) ((i) this.c.get())).L1(), str, null, 12);
    }

    public boolean n(C0633A c0633a, TotalAmount totalAmount) {
        if (totalAmount == null) {
            return false;
        }
        String string = ((MayaAbstractBaseUserActivityFragmentImpl) ((i) this.c.get())).getString(R.string.maya_label_amount_paid);
        j.f(string, numX49.tnTj78("bFG2"));
        String label = totalAmount.getLabel();
        String strI = s.i(((MayaAbstractBaseUserActivityFragmentImpl) ((i) this.c.get())).K1(), totalAmount.getFormattedValue());
        String value = totalAmount.getValue();
        return C0633A.a(c0633a, string, label, strI, !(value == null || C2576A.H(value)), null, 16);
    }

    public InterfaceC2528a o() {
        Object obj = this.c.get();
        j.e(obj, numX49.tnTj78("bFGL"));
        return (InterfaceC2528a) obj;
    }

    public void q(ActivityDescription activityDescription) {
        v vVar = (v) this.c.get();
        String strMAction = activityDescription != null ? activityDescription.mAction() : null;
        TextView textView = ((MayaAbstractBaseUserActivityFragmentImpl) vVar).f10299W;
        if (textView != null) {
            textView.setText(strMAction);
        } else {
            j.n(numX49.tnTj78("bFGr"));
            throw null;
        }
    }

    public void r(String str, String str2) {
        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
        mayaAbstractBaseUserActivityFragmentImpl.I1().setVisibility(0);
        ViewGroup.LayoutParams layoutParams = mayaAbstractBaseUserActivityFragmentImpl.H1().getLayoutParams();
        j.e(layoutParams, numX49.tnTj78("bFGZ"));
        ((ConstraintLayout.LayoutParams) layoutParams).verticalBias = 0.0f;
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != 747805177) {
                if (iHashCode != 921111605) {
                    if (iHashCode == 1844321735 && str2.equals(numX49.tnTj78("bFGk"))) {
                        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl2 = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
                        mayaAbstractBaseUserActivityFragmentImpl2.I1().setText(mayaAbstractBaseUserActivityFragmentImpl2.getString(R.string.maya_currency_symbol_with_amount_value, str));
                        TextViewCompat.setTextAppearance(mayaAbstractBaseUserActivityFragmentImpl2.I1(), R.style.JekoBoldH5_Quaternary);
                        return;
                    }
                } else if (str2.equals(numX49.tnTj78("bFGB"))) {
                    MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl3 = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
                    mayaAbstractBaseUserActivityFragmentImpl3.I1().setText(mayaAbstractBaseUserActivityFragmentImpl3.getString(R.string.maya_currency_symbol_with_negative_amount_value, str));
                    TextViewCompat.setTextAppearance(mayaAbstractBaseUserActivityFragmentImpl3.I1(), R.style.JekoBoldH5_Primary);
                    return;
                }
            } else if (str2.equals(numX49.tnTj78("bFGu"))) {
                MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl4 = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
                mayaAbstractBaseUserActivityFragmentImpl4.I1().setText(mayaAbstractBaseUserActivityFragmentImpl4.getString(R.string.maya_currency_symbol_with_amount_value, str));
                TextViewCompat.setTextAppearance(mayaAbstractBaseUserActivityFragmentImpl4.I1(), R.style.JekoBoldH5_Success);
                return;
            }
        }
        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl5 = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
        mayaAbstractBaseUserActivityFragmentImpl5.I1().setText(mayaAbstractBaseUserActivityFragmentImpl5.getString(R.string.maya_currency_symbol_with_amount_value, str));
        TextViewCompat.setTextAppearance(mayaAbstractBaseUserActivityFragmentImpl5.I1(), R.style.JekoBoldH5_Primary);
    }

    public void s(String str) {
        v vVar = (v) this.c.get();
        String strF = AbstractC1234x.f(AbstractC1234x.b(str));
        TextView textView = ((MayaAbstractBaseUserActivityFragmentImpl) vVar).f10308f0;
        if (textView != null) {
            textView.setText(strF);
        } else {
            j.n(numX49.tnTj78("bFGV"));
            throw null;
        }
    }

    public void t(String str) {
        String strTnTj78 = numX49.tnTj78("bFGS");
        String strTnTj782 = numX49.tnTj78("bFGj");
        if (str == null || C2576A.H(str)) {
            TextView textView = ((MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get())).f10311i0;
            if (textView == null) {
                j.n(strTnTj782);
                throw null;
            }
            textView.setVisibility(8);
            TextView textView2 = ((MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get())).f10314l0;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            } else {
                j.n(strTnTj78);
                throw null;
            }
        }
        TextView textView3 = ((MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get())).f10311i0;
        if (textView3 == null) {
            j.n(strTnTj782);
            throw null;
        }
        textView3.setVisibility(0);
        TextView textView4 = ((MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get())).f10311i0;
        if (textView4 == null) {
            j.n(strTnTj782);
            throw null;
        }
        textView4.setText(str);
        TextView textView5 = ((MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get())).f10314l0;
        if (textView5 == null) {
            j.n(strTnTj78);
            throw null;
        }
        textView5.setVisibility(0);
        TextView textView6 = ((MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get())).f10314l0;
        if (textView6 != null) {
            textView6.setText(str);
        } else {
            j.n(strTnTj78);
            throw null;
        }
    }

    public void u(String str) {
        String strTnTj78 = numX49.tnTj78("bFGd");
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1879307469) {
                if (iHashCode != 601036331) {
                    if (iHashCode == 2096857181 && str.equals(numX49.tnTj78("bFGi"))) {
                        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
                        ImageView imageView = mayaAbstractBaseUserActivityFragmentImpl.f10306d0;
                        if (imageView == null) {
                            j.n(strTnTj78);
                            throw null;
                        }
                        imageView.setImageDrawable(ContextCompat.getDrawable(mayaAbstractBaseUserActivityFragmentImpl.requireContext(), R.drawable.maya_ic_cross_red));
                        mayaAbstractBaseUserActivityFragmentImpl.J1().setText(mayaAbstractBaseUserActivityFragmentImpl.getString(R.string.maya_label_receipt_status_failed));
                        TextViewCompat.setTextAppearance(mayaAbstractBaseUserActivityFragmentImpl.J1(), R.style.CerebriMediumSmallText_Error);
                        return;
                    }
                } else if (str.equals(numX49.tnTj78("bFGE"))) {
                    MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl2 = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
                    ImageView imageView2 = mayaAbstractBaseUserActivityFragmentImpl2.f10306d0;
                    if (imageView2 == null) {
                        j.n(strTnTj78);
                        throw null;
                    }
                    imageView2.setImageDrawable(ContextCompat.getDrawable(mayaAbstractBaseUserActivityFragmentImpl2.requireContext(), R.drawable.maya_ic_check_green));
                    mayaAbstractBaseUserActivityFragmentImpl2.J1().setText(mayaAbstractBaseUserActivityFragmentImpl2.getString(R.string.maya_label_receipt_status_completed));
                    TextViewCompat.setTextAppearance(mayaAbstractBaseUserActivityFragmentImpl2.J1(), R.style.CerebriMediumSmallText_Accent);
                    return;
                }
            } else if (str.equals(numX49.tnTj78("bFGF"))) {
                MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl3 = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
                ImageView imageView3 = mayaAbstractBaseUserActivityFragmentImpl3.f10306d0;
                if (imageView3 == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                imageView3.setImageDrawable(ContextCompat.getDrawable(mayaAbstractBaseUserActivityFragmentImpl3.requireContext(), R.drawable.maya_ic_clock_yellow));
                mayaAbstractBaseUserActivityFragmentImpl3.J1().setText(mayaAbstractBaseUserActivityFragmentImpl3.getString(R.string.maya_label_receipt_status_processing));
                TextViewCompat.setTextAppearance(mayaAbstractBaseUserActivityFragmentImpl3.J1(), R.style.CerebriMediumSmallText_Secondary);
                return;
            }
        }
        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl4 = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
        ImageView imageView4 = mayaAbstractBaseUserActivityFragmentImpl4.f10306d0;
        if (imageView4 == null) {
            j.n(strTnTj78);
            throw null;
        }
        imageView4.setVisibility(8);
        mayaAbstractBaseUserActivityFragmentImpl4.J1().setVisibility(8);
    }

    public void v(String str) {
        boolean zB = j.b(str, numX49.tnTj78("bFGH"));
        String strTnTj78 = numX49.tnTj78("bFGO");
        if (zB) {
            ImageView imageView = ((MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get())).f10304b0;
            if (imageView == null) {
                j.n(strTnTj78);
                throw null;
            }
            imageView.setVisibility(0);
            MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
            ImageView imageView2 = mayaAbstractBaseUserActivityFragmentImpl.f10304b0;
            if (imageView2 != null) {
                imageView2.setImageDrawable(ContextCompat.getDrawable(mayaAbstractBaseUserActivityFragmentImpl.requireContext(), R.drawable.maya_ic_user_activity_sub_icon_money_in));
                return;
            } else {
                j.n(strTnTj78);
                throw null;
            }
        }
        if (!j.b(str, numX49.tnTj78("bFGQ"))) {
            ImageView imageView3 = ((MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get())).f10304b0;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
                return;
            } else {
                j.n(strTnTj78);
                throw null;
            }
        }
        ImageView imageView4 = ((MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get())).f10304b0;
        if (imageView4 == null) {
            j.n(strTnTj78);
            throw null;
        }
        imageView4.setVisibility(0);
        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl2 = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
        ImageView imageView5 = mayaAbstractBaseUserActivityFragmentImpl2.f10304b0;
        if (imageView5 != null) {
            imageView5.setImageDrawable(ContextCompat.getDrawable(mayaAbstractBaseUserActivityFragmentImpl2.requireContext(), R.drawable.maya_ic_user_activity_sub_icon_money_out));
        } else {
            j.n(strTnTj78);
            throw null;
        }
    }

    public void w(ActivityDescription activityDescription) {
        v vVar = (v) this.c.get();
        String strMAction = activityDescription != null ? activityDescription.mAction() : null;
        TextView textView = ((MayaAbstractBaseUserActivityFragmentImpl) vVar).f10299W;
        if (textView == null) {
            j.n(numX49.tnTj78("bFGt"));
            throw null;
        }
        textView.setText(strMAction);
        ((MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get())).Q1(activityDescription != null ? activityDescription.mTarget() : null);
    }

    public void x(String str, String str2, TransferPersonalizationMeta transferPersonalizationMeta) {
        if (str != null && transferPersonalizationMeta != null) {
            if (!str.equals(numX49.tnTj78("bFGU")) || str2 == null) {
                return;
            }
            y(str2);
            return;
        }
        if (str2 != null) {
            y(str2);
            return;
        }
        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
        ImageView imageView = mayaAbstractBaseUserActivityFragmentImpl.m0;
        if (imageView == null) {
            j.n(numX49.tnTj78("bFGC"));
            throw null;
        }
        imageView.setVisibility(8);
        ImageView imageView2 = mayaAbstractBaseUserActivityFragmentImpl.f10313k0;
        if (imageView2 == null) {
            j.n(numX49.tnTj78("bFG8"));
            throw null;
        }
        imageView2.setVisibility(8);
        ConstraintLayout constraintLayout = mayaAbstractBaseUserActivityFragmentImpl.f10312j0;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        } else {
            j.n(numX49.tnTj78("bFGe"));
            throw null;
        }
    }

    public void y(String str) {
        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
        mayaAbstractBaseUserActivityFragmentImpl.requireContext();
        ImageView imageView = mayaAbstractBaseUserActivityFragmentImpl.f10313k0;
        String strTnTj78 = numX49.tnTj78("bFG4");
        if (imageView == null) {
            j.n(strTnTj78);
            throw null;
        }
        C.g0(imageView, str);
        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl2 = (MayaAbstractBaseUserActivityFragmentImpl) ((v) this.c.get());
        ImageView imageView2 = mayaAbstractBaseUserActivityFragmentImpl2.m0;
        if (imageView2 == null) {
            j.n(numX49.tnTj78("bFGK"));
            throw null;
        }
        imageView2.setVisibility(0);
        ImageView imageView3 = mayaAbstractBaseUserActivityFragmentImpl2.f10313k0;
        if (imageView3 == null) {
            j.n(strTnTj78);
            throw null;
        }
        imageView3.setVisibility(0);
        ConstraintLayout constraintLayout = mayaAbstractBaseUserActivityFragmentImpl2.f10312j0;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        } else {
            j.n(numX49.tnTj78("bFGo"));
            throw null;
        }
    }
}
