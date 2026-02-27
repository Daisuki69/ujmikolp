package zd;

import E8.E;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.paymaya.R;
import com.paymaya.domain.model.FinancialDocument;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDFinancialDocumentsFragment;
import com.paymaya.ui.ekyc.view.widget.EDDInputFinancialDocument;
import java.util.List;
import zj.C2576A;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EDDFinancialDocumentsFragment f21384b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21385d;

    public /* synthetic */ k(EDDFinancialDocumentsFragment eDDFinancialDocumentsFragment, Object obj, Object obj2, int i) {
        this.f21383a = i;
        this.f21384b = eDDFinancialDocumentsFragment;
        this.c = obj;
        this.f21385d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f21383a) {
            case 0:
                EDDFinancialDocumentsFragment eDDFinancialDocumentsFragment = this.f21384b;
                EDDInputFinancialDocument eDDInputFinancialDocument = (EDDInputFinancialDocument) this.c;
                List list = (List) this.f21385d;
                sd.e eVarZ1 = eDDFinancialDocumentsFragment.z1();
                String documentId = eDDInputFinancialDocument.getDocumentId();
                String mFileUrl = eDDInputFinancialDocument.getMFileUrl();
                boolean z4 = mFileUrl == null || C2576A.H(mFileUrl);
                FinancialDocument mFinancialDocument = eDDInputFinancialDocument.getMFinancialDocument();
                FinancialDocument newFinancialDocument = (FinancialDocument) list.get(i);
                kotlin.jvm.internal.j.g(documentId, "documentId");
                kotlin.jvm.internal.j.g(newFinancialDocument, "newFinancialDocument");
                if (z4 || mFinancialDocument == null || newFinancialDocument.equals(mFinancialDocument)) {
                    ((EDDFinancialDocumentsFragment) ((yd.f) eVarZ1.c.get())).B1(documentId, newFinancialDocument);
                } else {
                    EDDFinancialDocumentsFragment eDDFinancialDocumentsFragment2 = (EDDFinancialDocumentsFragment) ((yd.f) eVarZ1.c.get());
                    eDDFinancialDocumentsFragment2.getClass();
                    Context context = eDDFinancialDocumentsFragment2.getContext();
                    if (context != null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        builder.setTitle(context.getString(R.string.pma_label_edd_change_confirmation_title));
                        builder.setMessage(R.string.pma_label_edd_change_confirmation_spiel).setPositiveButton(R.string.pma_label_yes, new k(eDDFinancialDocumentsFragment2, documentId, newFinancialDocument, 1)).setNegativeButton(R.string.pma_label_cancel, new E(9));
                        builder.show();
                    }
                }
                break;
            default:
                this.f21384b.B1((String) this.c, (FinancialDocument) this.f21385d);
                break;
        }
    }
}
