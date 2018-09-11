package ar.edu.itba.altbeaconintegration;

import java.util.Collection;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.MonitorNotifier;
import org.altbeacon.beacon.RangeNotifier;
import org.altbeacon.beacon.Region;

//TODO refactor activity to MVP
public class MainActivityPresenter implements MonitorNotifier, RangeNotifier {

    //------ METHODS for MonitorNotifier------>

    @Override
    public void didEnterRegion(final Region region) {

    }

    @Override
    public void didExitRegion(final Region region) {

    }

    @Override
    public void didDetermineStateForRegion(final int i, final Region region) {

    }

    //<------ METHODS for MonitorNotifier------


    //------ METHODS for RegionNotifier------>
    @Override
    public void didRangeBeaconsInRegion(final Collection<Beacon> collection, final Region region) {

    }
    //<------ METHODS for RegionNotifier------
}
