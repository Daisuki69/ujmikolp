package com.paymaya.domain.store;

import cj.C1132s;
import com.paymaya.R;
import com.paymaya.domain.model.DataPrivacyProvision;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.paymaya.domain.store.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CallableC1251c implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C1132s.g(new DataPrivacyProvision(DataPrivacyProvision.ID_WALLET, 2131231681, R.color.mauve_purple_25_alpha, "Wallet", "Opened by default", false, true), new DataPrivacyProvision(DataPrivacyProvision.ID_SAVINGS, 2131231536, R.color.neon_green_15_opacity, "Savings", "Opened after you upgrade your Maya account", true, true));
    }
}
