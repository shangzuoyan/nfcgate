package tud.seemuh.nfcgate.util.filter.conditional;

import tud.seemuh.nfcgate.util.NfcComm;
import tud.seemuh.nfcgate.util.filter.FilterInitException;

/**
 * Conditional that always returns true, as long as the provided NfcComm object is of the correct
 * type.
 */
public class All extends Conditional {
    public All(TARGET target) throws FilterInitException {
        super(target);
    }

    public All(TARGET target, ANTICOLFIELD field) throws FilterInitException {
        super(target, field);
    }

    @Override
    protected boolean checkNfcData(NfcComm nfcdata) {
        return true;
    }

    @Override
    protected boolean checkUidData(NfcComm nfcdata) {
        return true;
    }

    @Override
    protected boolean checkAtqaData(NfcComm nfcdata) {
        return true;
    }

    @Override
    protected boolean checkHistData(NfcComm nfcdata) {
        return true;
    }

    @Override
    protected boolean checkSakData(NfcComm nfcdata) {
        return true;
    }
}
