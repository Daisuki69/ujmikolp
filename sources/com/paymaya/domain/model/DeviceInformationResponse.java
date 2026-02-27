package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DeviceInformationResponse implements Parcelable {
    public static final Parcelable.Creator<DeviceInformationResponse> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("devices")
    private final List<DeviceInformation> devices;

    public static final class Creator implements Parcelable.Creator<DeviceInformationResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceInformationResponse createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int I4 = 0;
            while (I4 != i) {
                I4 = AbstractC1213b.I(DeviceInformation.CREATOR, parcel, arrayList, I4, 1);
            }
            return new DeviceInformationResponse(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceInformationResponse[] newArray(int i) {
            return new DeviceInformationResponse[i];
        }
    }

    public DeviceInformationResponse(List<DeviceInformation> devices) {
        j.g(devices, "devices");
        this.devices = devices;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceInformationResponse copy$default(DeviceInformationResponse deviceInformationResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deviceInformationResponse.devices;
        }
        return deviceInformationResponse.copy(list);
    }

    public final List<DeviceInformation> component1() {
        return this.devices;
    }

    public final DeviceInformationResponse copy(List<DeviceInformation> devices) {
        j.g(devices, "devices");
        return new DeviceInformationResponse(devices);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceInformationResponse) && j.b(this.devices, ((DeviceInformationResponse) obj).devices);
    }

    public final List<DeviceInformation> getDevices() {
        return this.devices;
    }

    public int hashCode() {
        return this.devices.hashCode();
    }

    public String toString() {
        return "DeviceInformationResponse(devices=" + this.devices + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Iterator itQ = AbstractC1213b.Q(this.devices, dest);
        while (itQ.hasNext()) {
            ((DeviceInformation) itQ.next()).writeToParcel(dest, i);
        }
    }
}
