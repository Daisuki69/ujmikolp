package G6;

import cj.C1110A;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.BankPullListItem;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.BankPullSettings;
import com.paymaya.domain.model.LinkedPaymentOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Ch.b, Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f1775a;

    public /* synthetic */ a(c cVar) {
        this.f1775a = cVar;
    }

    @Override // Ch.b
    public Object a(Object obj, Object obj2) {
        Map paymentTokens = (Map) obj;
        BankPullSettings bankPullSettings = (BankPullSettings) obj2;
        kotlin.jvm.internal.j.g(paymentTokens, "paymentTokens");
        kotlin.jvm.internal.j.g(bankPullSettings, "bankPullSettings");
        this.f1775a.getClass();
        List<BankPullPaymentOption> paymentOptions = bankPullSettings.getPaymentOptions();
        ArrayList<BankPullPaymentOption> arrayList = new ArrayList(cj.t.l(paymentOptions, 10));
        for (BankPullPaymentOption bankPullPaymentOption : paymentOptions) {
            bankPullPaymentOption.setCurrency(bankPullSettings.getCurrency());
            arrayList.add(bankPullPaymentOption);
        }
        ArrayList arrayList2 = new ArrayList(cj.t.l(arrayList, 10));
        for (BankPullPaymentOption bankPullPaymentOption2 : arrayList) {
            List list = (List) paymentTokens.get(bankPullPaymentOption2.getId());
            boolean z4 = false;
            if ((list != null ? list.size() : 0) >= bankPullPaymentOption2.getMaxLinkedAccounts()) {
                z4 = true;
            }
            arrayList2.add(new BankPullListItem.BankPullItem(bankPullPaymentOption2, z4));
        }
        ArrayList arrayList3 = new ArrayList();
        if (!paymentTokens.isEmpty()) {
            for (BankPullPaymentOption bankPullPaymentOption3 : arrayList) {
                List<LinkedPaymentOption> list2 = (List) paymentTokens.get(bankPullPaymentOption3.getId());
                List list3 = list2;
                if (list3 != null && !list3.isEmpty()) {
                    for (LinkedPaymentOption linkedPaymentOption : list2) {
                        BankPullPaymentOption bankPullPaymentOptionCopy$default = BankPullPaymentOption.copy$default(bankPullPaymentOption3, null, false, 0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
                        bankPullPaymentOptionCopy$default.setPaymentOption(linkedPaymentOption);
                        arrayList3.add(new BankPullListItem.BankPullNewLinked(bankPullPaymentOptionCopy$default));
                        paymentTokens = paymentTokens;
                    }
                }
                paymentTokens = paymentTokens;
            }
        }
        return new Pair(C1110A.V(arrayList2), C1110A.V(arrayList3));
    }

    @Override // Ch.a
    public void run() {
        ((MayaBaseFragment) ((K6.c) this.f1775a.c.get())).w1();
    }
}
