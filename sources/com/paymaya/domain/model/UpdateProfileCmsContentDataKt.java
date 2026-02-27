package com.paymaya.domain.model;

import cj.C1110A;
import cj.C1112C;
import cj.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class UpdateProfileCmsContentDataKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> filterByProhibitedCodes(List<? extends T> allItems, Set<String> prohibitedCodes, Function1<? super T, String> itemCode) {
        j.g(allItems, "allItems");
        j.g(prohibitedCodes, "prohibitedCodes");
        j.g(itemCode, "itemCode");
        if (prohibitedCodes.isEmpty()) {
            return allItems;
        }
        ArrayList arrayList = new ArrayList();
        for (T t5 : allItems) {
            if (!prohibitedCodes.contains(itemCode.invoke(t5))) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    public static final List<UpdateProfileIncomeSource> filteredIncomeSourcesFor(UpdateProfileCmsContentData updateProfileCmsContentData, String code) {
        Object next;
        j.g(updateProfileCmsContentData, "<this>");
        j.g(code, "code");
        List<UpdateProfileIncomeSource> incomeSources = updateProfileCmsContentData.getIncomeSources();
        if (incomeSources == null) {
            incomeSources = C1112C.f9377a;
        }
        List<UpdateProfileWorkNature> workNatures = updateProfileCmsContentData.getWorkNatures();
        List<ProhibitedIncomeSource> prohibitedIncomeSources = null;
        if (workNatures != null) {
            Iterator<T> it = workNatures.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (j.b(((UpdateProfileWorkNature) next).getCode(), code)) {
                    break;
                }
            }
            UpdateProfileWorkNature updateProfileWorkNature = (UpdateProfileWorkNature) next;
            if (updateProfileWorkNature != null) {
                prohibitedIncomeSources = updateProfileWorkNature.getProhibitedIncomeSources();
            }
        }
        if (prohibitedIncomeSources == null) {
            prohibitedIncomeSources = C1112C.f9377a;
        }
        List<ProhibitedIncomeSource> list = prohibitedIncomeSources;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ProhibitedIncomeSource) it2.next()).getCode());
        }
        Set setZ = C1110A.Z(arrayList);
        if (setZ.isEmpty()) {
            return incomeSources;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : incomeSources) {
            String code2 = ((UpdateProfileIncomeSource) obj).getCode();
            if (code2 == null) {
                code2 = "";
            }
            if (!setZ.contains(code2)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final List<JobTitle> filteredJobTitlesFor(UpdateProfileCmsContentData updateProfileCmsContentData, String code) {
        Object next;
        j.g(updateProfileCmsContentData, "<this>");
        j.g(code, "code");
        List<JobTitle> jobTitles = updateProfileCmsContentData.getJobTitles();
        if (jobTitles == null) {
            jobTitles = C1112C.f9377a;
        }
        List<UpdateProfileWorkNature> workNatures = updateProfileCmsContentData.getWorkNatures();
        List<ProhibitedJobTitle> prohibitedJobTitles = null;
        if (workNatures != null) {
            Iterator<T> it = workNatures.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (j.b(((UpdateProfileWorkNature) next).getCode(), code)) {
                    break;
                }
            }
            UpdateProfileWorkNature updateProfileWorkNature = (UpdateProfileWorkNature) next;
            if (updateProfileWorkNature != null) {
                prohibitedJobTitles = updateProfileWorkNature.getProhibitedJobTitles();
            }
        }
        if (prohibitedJobTitles == null) {
            prohibitedJobTitles = C1112C.f9377a;
        }
        List<ProhibitedJobTitle> list = prohibitedJobTitles;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ProhibitedJobTitle) it2.next()).getCode());
        }
        Set setZ = C1110A.Z(arrayList);
        if (setZ.isEmpty()) {
            return jobTitles;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : jobTitles) {
            String code2 = ((JobTitle) obj).getCode();
            if (code2 == null) {
                code2 = "";
            }
            if (!setZ.contains(code2)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
