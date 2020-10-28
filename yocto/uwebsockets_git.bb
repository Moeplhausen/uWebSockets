DESCRIPTION = "uWebSockets - Micro websockets library"
SECTION = "uwebsockets"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
PR = "r0"

DEPENDS = "zlib openssl"

SRC_URI = "gitsm://github.com/ithinx-io/uWebSockets;branch=master;protocol=https"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

EXTRA_OECMAKE = "-DUWS_VERSION=${PV} -DBUILD_EXAMPLES=OFF -DENABLE_LIBUV=OFF -DENABLE_OPENSSL=ON"

inherit cmake
