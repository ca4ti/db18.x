# Copyright (c) 1996, 2019 Oracle and/or its affiliates.  All rights reserved.
#
# See the file LICENSE for license information.
#
# $Id$
#
# TEST	dead009
# TEST	Run dead002 deadlock test using priorities
proc dead009 { {tnum "009"} } {
	source ./include.tcl
	dead002 "2 4 10" "ring clump" "0" $tnum 1

}
