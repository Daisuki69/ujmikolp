package sd;

import G5.l;
import androidx.fragment.app.FragmentActivity;
import cj.t;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.EDD;
import com.paymaya.domain.store.N;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDBankInformationFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDIncomeSourceFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDRelatedCompaniesFragment;
import com.paymaya.ui.ekyc.view.widget.EDDInput;
import com.paymaya.ui.ekyc.view.widget.EDDOptionsInput;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import rd.InterfaceC2200a;
import td.InterfaceC2283a;
import yd.i;
import zd.m;
import zd.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends AbstractC2252a implements InterfaceC2200a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20040d;
    public final N e;

    public /* synthetic */ d(N n7, int i) {
        this.f20040d = i;
        this.e = n7;
    }

    @Override // rd.InterfaceC2200a
    public final void a() {
        boolean zR1;
        boolean zR12;
        boolean zR13;
        switch (this.f20040d) {
            case 0:
                if (((AbstractBaseEDDFormFragmentImpl) ((yd.e) this.c.get())).f14506T == -1) {
                    ((AbstractBaseEDDFormFragmentImpl) ((yd.e) this.c.get())).y1();
                    zR1 = false;
                } else {
                    zR1 = ((AbstractBaseEDDFormFragmentImpl) ((yd.e) this.c.get())).f14506T == 1 ? true : ((AbstractBaseEDDFormFragmentImpl) ((yd.e) this.c.get())).r1();
                }
                if (zR1) {
                    yd.e eVar = (yd.e) this.c.get();
                    ArrayList arrayList = ((EDDBankInformationFragment) ((yd.e) this.c.get())).f14508V;
                    ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        String strTnTj78 = numX49.tnTj78("bFGPB");
                        if (!zHasNext) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : arrayList2) {
                                String input = ((EDDOptionsInput) obj).getInput();
                                if (input != null && input.length() != 0) {
                                    arrayList3.add(obj);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(t.l(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                String input2 = ((EDDOptionsInput) it2.next()).getInput();
                                j.d(input2);
                                arrayList4.add(input2);
                            }
                            EDDBankInformationFragment eDDBankInformationFragment = (EDDBankInformationFragment) eVar;
                            eDDBankInformationFragment.getClass();
                            for (Bd.j jVar : eDDBankInformationFragment.f14508V) {
                                j.e(jVar, strTnTj78);
                                l.a(((EDDOptionsInput) jVar).getMOptionsTextInputLayout());
                            }
                            FragmentActivity fragmentActivityRequireActivity = eDDBankInformationFragment.requireActivity();
                            ArrayList<Bd.j> arrayList5 = eDDBankInformationFragment.f14508V;
                            ArrayList arrayList6 = new ArrayList(t.l(arrayList5, 10));
                            for (Bd.j jVar2 : arrayList5) {
                                j.e(jVar2, strTnTj78);
                                arrayList6.add(((EDDOptionsInput) jVar2).getMEditText());
                            }
                            C.S(fragmentActivityRequireActivity, arrayList6);
                            zd.j jVar3 = eDDBankInformationFragment.f14530Z;
                            if (jVar3 != null) {
                                C2254c c2254cT1 = ((EDDActivity) jVar3).t1();
                                EDD edd = c2254cT1.i;
                                if (edd != null) {
                                    if (arrayList4.isEmpty()) {
                                        arrayList4 = null;
                                    }
                                    edd.setBanks(arrayList4);
                                }
                                ((EDDActivity) ((InterfaceC2283a) c2254cT1.c.get())).w1();
                            }
                        } else {
                            Bd.j jVar4 = (Bd.j) it.next();
                            j.e(jVar4, strTnTj78);
                            arrayList2.add((EDDOptionsInput) jVar4);
                        }
                    }
                }
                break;
            case 1:
                if (((AbstractBaseEDDFormFragmentImpl) ((yd.g) this.c.get())).f14506T == -1) {
                    ((AbstractBaseEDDFormFragmentImpl) ((yd.g) this.c.get())).y1();
                    zR12 = false;
                } else {
                    zR12 = ((AbstractBaseEDDFormFragmentImpl) ((yd.g) this.c.get())).f14506T == 1 ? true : ((AbstractBaseEDDFormFragmentImpl) ((yd.g) this.c.get())).r1();
                }
                if (zR12) {
                    yd.g gVar = (yd.g) this.c.get();
                    ArrayList arrayList7 = ((EDDIncomeSourceFragment) ((yd.g) this.c.get())).f14508V;
                    ArrayList arrayList8 = new ArrayList(t.l(arrayList7, 10));
                    Iterator it3 = arrayList7.iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        String strTnTj782 = numX49.tnTj78("bFGPk");
                        if (!zHasNext2) {
                            ArrayList arrayList9 = new ArrayList();
                            for (Object obj2 : arrayList8) {
                                String input3 = ((EDDOptionsInput) obj2).getInput();
                                if (input3 != null && input3.length() != 0) {
                                    arrayList9.add(obj2);
                                }
                            }
                            ArrayList arrayList10 = new ArrayList(t.l(arrayList9, 10));
                            Iterator it4 = arrayList9.iterator();
                            while (it4.hasNext()) {
                                String input4 = ((EDDOptionsInput) it4.next()).getInput();
                                j.d(input4);
                                arrayList10.add(input4);
                            }
                            EDDIncomeSourceFragment eDDIncomeSourceFragment = (EDDIncomeSourceFragment) gVar;
                            eDDIncomeSourceFragment.getClass();
                            for (Bd.j jVar5 : eDDIncomeSourceFragment.f14508V) {
                                j.e(jVar5, strTnTj782);
                                l.a(((EDDOptionsInput) jVar5).getMOptionsTextInputLayout());
                            }
                            FragmentActivity fragmentActivityRequireActivity2 = eDDIncomeSourceFragment.requireActivity();
                            ArrayList<Bd.j> arrayList11 = eDDIncomeSourceFragment.f14508V;
                            ArrayList arrayList12 = new ArrayList(t.l(arrayList11, 10));
                            for (Bd.j jVar6 : arrayList11) {
                                j.e(jVar6, strTnTj782);
                                arrayList12.add(((EDDOptionsInput) jVar6).getMEditText());
                            }
                            C.S(fragmentActivityRequireActivity2, arrayList12);
                            m mVar = eDDIncomeSourceFragment.f14537Z;
                            if (mVar != null) {
                                C2254c c2254cT12 = ((EDDActivity) mVar).t1();
                                EDD edd2 = c2254cT12.i;
                                if (edd2 != null) {
                                    if (arrayList10.isEmpty()) {
                                        arrayList10 = null;
                                    }
                                    edd2.setAlternativeIncomeSources(arrayList10);
                                }
                                ((EDDActivity) ((InterfaceC2283a) c2254cT12.c.get())).w1();
                            }
                        } else {
                            Bd.j jVar7 = (Bd.j) it3.next();
                            j.e(jVar7, strTnTj782);
                            arrayList8.add((EDDOptionsInput) jVar7);
                        }
                    }
                }
                break;
            default:
                if (((AbstractBaseEDDFormFragmentImpl) ((i) this.c.get())).f14506T == -1) {
                    ((AbstractBaseEDDFormFragmentImpl) ((i) this.c.get())).y1();
                    zR13 = false;
                } else {
                    zR13 = ((AbstractBaseEDDFormFragmentImpl) ((i) this.c.get())).f14506T == 1 ? true : ((AbstractBaseEDDFormFragmentImpl) ((i) this.c.get())).r1();
                }
                if (zR13) {
                    i iVar = (i) this.c.get();
                    ArrayList arrayList13 = ((EDDRelatedCompaniesFragment) ((i) this.c.get())).f14508V;
                    ArrayList arrayList14 = new ArrayList(t.l(arrayList13, 10));
                    Iterator it5 = arrayList13.iterator();
                    while (true) {
                        boolean zHasNext3 = it5.hasNext();
                        String strTnTj783 = numX49.tnTj78("bFGPZ");
                        if (!zHasNext3) {
                            ArrayList arrayList15 = new ArrayList();
                            for (Object obj3 : arrayList14) {
                                String input5 = ((EDDInput) obj3).getInput();
                                if (input5 != null && input5.length() != 0) {
                                    arrayList15.add(obj3);
                                }
                            }
                            ArrayList arrayList16 = new ArrayList(t.l(arrayList15, 10));
                            Iterator it6 = arrayList15.iterator();
                            while (it6.hasNext()) {
                                String input6 = ((EDDInput) it6.next()).getInput();
                                j.d(input6);
                                arrayList16.add(input6);
                            }
                            EDDRelatedCompaniesFragment eDDRelatedCompaniesFragment = (EDDRelatedCompaniesFragment) iVar;
                            eDDRelatedCompaniesFragment.getClass();
                            for (Bd.j jVar8 : eDDRelatedCompaniesFragment.f14508V) {
                                j.e(jVar8, strTnTj783);
                                l.a(((EDDInput) jVar8).getMTextInputLayout());
                            }
                            FragmentActivity fragmentActivityRequireActivity3 = eDDRelatedCompaniesFragment.requireActivity();
                            ArrayList<Bd.j> arrayList17 = eDDRelatedCompaniesFragment.f14508V;
                            ArrayList arrayList18 = new ArrayList(t.l(arrayList17, 10));
                            for (Bd.j jVar9 : arrayList17) {
                                j.e(jVar9, strTnTj783);
                                arrayList18.add(((EDDInput) jVar9).getMEditText());
                            }
                            C.S(fragmentActivityRequireActivity3, arrayList18);
                            o oVar = eDDRelatedCompaniesFragment.f14544Z;
                            if (oVar != null) {
                                C2254c c2254cT13 = ((EDDActivity) oVar).t1();
                                if (arrayList16.isEmpty()) {
                                    EDD edd3 = c2254cT13.i;
                                    if (edd3 != null) {
                                        edd3.setRelatedCompanies(null);
                                    }
                                } else {
                                    EDD edd4 = c2254cT13.i;
                                    if (edd4 != null) {
                                        edd4.setRelatedCompanies(arrayList16);
                                    }
                                }
                                ((EDDActivity) ((InterfaceC2283a) c2254cT13.c.get())).w1();
                            }
                        } else {
                            Bd.j jVar10 = (Bd.j) it5.next();
                            j.e(jVar10, strTnTj783);
                            arrayList14.add((EDDInput) jVar10);
                        }
                    }
                }
                break;
        }
    }
}
