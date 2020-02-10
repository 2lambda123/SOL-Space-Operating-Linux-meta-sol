SUMMARY = "SOL core development image"

LICENSE = "MIT"
LICENSE_FLAGS_WHITELIST = "commercial"

inherit core-image image_types_tegra
require core-image-sol.bb

#
# Jetson Specific Configurations
#

# This must be set in your local.conf in the build/conf directory.
# NVIDIA_DEVNET_MIRROR = "file:///home/$USER$/Downloads/nvidia/sdkm_downloads"

# Generates a .zip folder containing flashing scripts in
# tmp/deploy/images/$MACHINE$.
IMAGE_CLASSES += "image_types_tegra"
IMAGE_FSTYPES = "tegraflash"

# Development features
IMAGE_FEATURES += "splash x11-base hwcodecs ssh-server-openssh \
    post-install-logging"
IMAGE_FEATURES_remove = "allow-empty-password empty-root-password"

# Development tool packages to install
IMAGE_INSTALL += "sol-packagegroup-devtools"

# Set root password
# password = "test"
EXTRA_USERS_PARAMS = "usermod -p m7or76bu6AEY6 root;"