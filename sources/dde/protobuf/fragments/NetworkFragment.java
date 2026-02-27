package dde.protobuf.fragments;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.AbstractC1414e;
import dg.O;
import dg.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class NetworkFragment extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "dde.protobuf.fragments.Bluetooth#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<Bluetooth> bluetooth;

    @WireField(adapter = "dde.protobuf.fragments.ExtractionDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ExtractionDetails extractionDetails;

    @WireField(adapter = "dde.protobuf.fragments.SimCard#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<SimCard> simCards;

    @WireField(adapter = "dde.protobuf.fragments.Wifi#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Wifi> wifi;
    public static final P Companion = new P();
    public static final ProtoAdapter<NetworkFragment> ADAPTER = new O(FieldEncoding.LENGTH_DELIMITED, z.a(NetworkFragment.class), "type.googleapis.com/dde.protobuf.fragments.NetworkFragment", Syntax.PROTO_3, null, "dde-protobuf/fragments/NetworkFragment.proto");

    public NetworkFragment() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkFragment copy$default(NetworkFragment networkFragment, ExtractionDetails extractionDetails, List list, List list2, List list3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            extractionDetails = networkFragment.extractionDetails;
        }
        if ((i & 2) != 0) {
            list = networkFragment.simCards;
        }
        if ((i & 4) != 0) {
            list2 = networkFragment.wifi;
        }
        if ((i & 8) != 0) {
            list3 = networkFragment.bluetooth;
        }
        if ((i & 16) != 0) {
            byteString = networkFragment.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list4 = list2;
        return networkFragment.copy(extractionDetails, list, list4, list3, byteString2);
    }

    public final NetworkFragment copy(ExtractionDetails extractionDetails, List<SimCard> simCards, List<Wifi> wifi, List<Bluetooth> bluetooth, ByteString unknownFields) {
        j.g(simCards, "simCards");
        j.g(wifi, "wifi");
        j.g(bluetooth, "bluetooth");
        j.g(unknownFields, "unknownFields");
        return new NetworkFragment(extractionDetails, simCards, wifi, bluetooth, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkFragment)) {
            return false;
        }
        NetworkFragment networkFragment = (NetworkFragment) obj;
        return j.b(unknownFields(), networkFragment.unknownFields()) && j.b(this.extractionDetails, networkFragment.extractionDetails) && j.b(this.simCards, networkFragment.simCards) && j.b(this.wifi, networkFragment.wifi) && j.b(this.bluetooth, networkFragment.bluetooth);
    }

    public final List<Bluetooth> getBluetooth() {
        return this.bluetooth;
    }

    public final ExtractionDetails getExtractionDetails() {
        return this.extractionDetails;
    }

    public final List<SimCard> getSimCards() {
        return this.simCards;
    }

    public final List<Wifi> getWifi() {
        return this.wifi;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ExtractionDetails extractionDetails = this.extractionDetails;
        int iHashCode2 = this.bluetooth.hashCode() + AbstractC1414e.d(this.wifi, AbstractC1414e.d(this.simCards, (iHashCode + (extractionDetails != null ? extractionDetails.hashCode() : 0)) * 37, 37), 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m246newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.extractionDetails != null) {
            arrayList.add("extractionDetails=" + this.extractionDetails);
        }
        if (!this.simCards.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("simCards="), this.simCards, arrayList);
        }
        if (!this.wifi.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("wifi="), this.wifi, arrayList);
        }
        if (!this.bluetooth.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("bluetooth="), this.bluetooth, arrayList);
        }
        return C1110A.F(arrayList, ", ", "NetworkFragment{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFragment(ExtractionDetails extractionDetails, List<SimCard> simCards, List<Wifi> wifi, List<Bluetooth> bluetooth, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(simCards, "simCards");
        j.g(wifi, "wifi");
        j.g(bluetooth, "bluetooth");
        j.g(unknownFields, "unknownFields");
        this.extractionDetails = extractionDetails;
        this.simCards = Internal.immutableCopyOf("simCards", simCards);
        this.wifi = Internal.immutableCopyOf("wifi", wifi);
        this.bluetooth = Internal.immutableCopyOf("bluetooth", bluetooth);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m246newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public NetworkFragment(ExtractionDetails extractionDetails, List list, List list2, List list3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extractionDetails, (i & 2) != 0 ? C1112C.f9377a : list, (i & 4) != 0 ? C1112C.f9377a : list2, (i & 8) != 0 ? C1112C.f9377a : list3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }
}
