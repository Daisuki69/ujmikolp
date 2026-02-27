package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Bluetooth;
import dde.protobuf.fragments.ExtractionDetails;
import dde.protobuf.fragments.NetworkFragment;
import dde.protobuf.fragments.SimCard;
import dde.protobuf.fragments.Wifi;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, numX49.tnTj78("bd5f"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long jBeginMessage = protoReader.beginMessage();
        ExtractionDetails extractionDetailsDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new NetworkFragment(extractionDetailsDecode, arrayListJ, arrayList, arrayList2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                extractionDetailsDecode = ExtractionDetails.ADAPTER.decode(protoReader);
            } else if (iNextTag == 2) {
                arrayListJ.add(SimCard.ADAPTER.decode(protoReader));
            } else if (iNextTag == 3) {
                arrayList.add(Wifi.ADAPTER.decode(protoReader));
            } else if (iNextTag != 4) {
                protoReader.readUnknownField(iNextTag);
            } else {
                arrayList2.add(Bluetooth.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        NetworkFragment networkFragment = (NetworkFragment) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd51"));
        kotlin.jvm.internal.j.g(networkFragment, numX49.tnTj78("bd5n"));
        if (networkFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(protoWriter, 1, networkFragment.getExtractionDetails());
        }
        SimCard.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, networkFragment.getSimCards());
        Wifi.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, networkFragment.getWifi());
        Bluetooth.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, networkFragment.getBluetooth());
        protoWriter.writeBytes(networkFragment.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NetworkFragment networkFragment = (NetworkFragment) obj;
        kotlin.jvm.internal.j.g(networkFragment, numX49.tnTj78("bd55"));
        int size = networkFragment.unknownFields().size();
        if (networkFragment.getExtractionDetails() != null) {
            size += ExtractionDetails.ADAPTER.encodedSizeWithTag(1, networkFragment.getExtractionDetails());
        }
        return Bluetooth.ADAPTER.asRepeated().encodedSizeWithTag(4, networkFragment.getBluetooth()) + Wifi.ADAPTER.asRepeated().encodedSizeWithTag(3, networkFragment.getWifi()) + SimCard.ADAPTER.asRepeated().encodedSizeWithTag(2, networkFragment.getSimCards()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NetworkFragment networkFragment = (NetworkFragment) obj;
        kotlin.jvm.internal.j.g(networkFragment, numX49.tnTj78("bd5J"));
        ExtractionDetails extractionDetails = networkFragment.getExtractionDetails();
        return networkFragment.copy(extractionDetails != null ? ExtractionDetails.ADAPTER.redact(extractionDetails) : null, Internal.m186redactElements(networkFragment.getSimCards(), SimCard.ADAPTER), Internal.m186redactElements(networkFragment.getWifi(), Wifi.ADAPTER), Internal.m186redactElements(networkFragment.getBluetooth(), Bluetooth.ADAPTER), ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        NetworkFragment networkFragment = (NetworkFragment) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5x"));
        kotlin.jvm.internal.j.g(networkFragment, numX49.tnTj78("bd5s"));
        reverseProtoWriter.writeBytes(networkFragment.unknownFields());
        Bluetooth.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, networkFragment.getBluetooth());
        Wifi.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, networkFragment.getWifi());
        SimCard.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, networkFragment.getSimCards());
        if (networkFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, networkFragment.getExtractionDetails());
        }
    }
}
