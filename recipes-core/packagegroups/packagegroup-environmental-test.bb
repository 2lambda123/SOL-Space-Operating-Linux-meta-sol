SUMMARY = "SOL development applications" 
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

COMMON_FEATURES_remove = "ssh-server-dropbear"

RDEPENDS_${PN} = " \
    go-runtime \
    telegraf \
    stress-ng \
    rt-tests \
    memtester \
    e2fsprogs \
    tegra-pwrmon \
    offline-time-sync \
    cuda-samples \
    enviro-test \
    lmsensors-libsensors \
    lmsensors-sensord \
    lmsensors-sensors \
    lmsensors-sensorsconfconvert \
"