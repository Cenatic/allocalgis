// jecw.h : main header file for the jecw DLL
//

#pragma once

#ifndef __AFXWIN_H__
	#error "include 'stdafx.h' before including this file for PCH"
#endif

#include "resource.h"		// main symbols


// CjecwApp
// See jecw.cpp for the implementation of this class
//

class CjecwApp : public CWinApp
{
public:
	CjecwApp();

// Overrides
public:
	virtual BOOL InitInstance();

	DECLARE_MESSAGE_MAP()
};
