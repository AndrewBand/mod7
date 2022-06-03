package generic.lection_case;

public class SysAdminRepocitory implements Repository<SysAdmin, SysAdminManager>{
    private SysAdmin sysAdmin;
    private SysAdminManager sysAdminManager;
    @Override
    public void save(SysAdmin sysAdmin, SysAdminManager sysAdminManager) {
        this.sysAdmin = sysAdmin;
        this.sysAdminManager = sysAdminManager;
    }

    @Override
    public SysAdmin getKey() {
        return sysAdmin;
    }

    @Override
    public SysAdminManager getValue() {
        return sysAdminManager;
    }
}
