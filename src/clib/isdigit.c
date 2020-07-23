/*-
 * Copyright (c) 2005, 2019 Oracle and/or its affiliates.  All rights reserved.
 *
 * See the file LICENSE for license information.
 *
 * $Id$
 */

#include "db_config.h"

#include "db_int.h"

/*
 * isdigit --
 *
 * PUBLIC: #ifndef HAVE_ISDIGIT
 * PUBLIC: int isdigit __P((int));
 * PUBLIC: #endif
 */
int
isdigit(c)
	int c;
{
	/*
	 * Depends on ASCII-like character ordering.
	 */
	return (c >= '0' && c <= '9' ? 1 : 0);
}
