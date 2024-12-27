package wizard.files.kmpLibrary.sample

import wizard.ProjectFile

class SampleIosXcodeInfoPlist() : ProjectFile {
    override val path = "sample/iosApp/iosApp/Info.plist"
    override val content = """
        <?xml version="1.0" encoding="UTF-8"?>
        <!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
        <plist version="1.0">
        <dict>
        	<key>CADisableMinimumFrameDurationOnPhone</key>
        	<true/>
        </dict>
        </plist>
    """.trimIndent()
}

class SampleIosXcodeIosAppSwift() : ProjectFile {
    override val path = "sample/iosApp/iosApp/iosApp.swift"
    override val content = """
        import UIKit
        import ComposeApp

        @main
        class AppDelegate: UIResponder, UIApplicationDelegate {
            var window: UIWindow?

            func application(
                _ application: UIApplication,
                didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?
            ) -> Bool {
                window = UIWindow(frame: UIScreen.main.bounds)
                if let window = window {
                    window.rootViewController = MainKt.MainViewController()
                    window.makeKeyAndVisible()
                }
                return true
            }
        }
    """.trimIndent()
}

class SampleIosXcodePbxproj() : ProjectFile {
    override val path = "sample/iosApp/iosApp.xcodeproj/project.pbxproj"
    override val content = """
        // !${'$'}*UTF8*${'$'}!
        {
        	archiveVersion = 1;
        	classes = {
        	};
        	objectVersion = 56;
        	objects = {

        /* Begin PBXBuildFile section */
        		A93A953B29CC810C00F8E227 /* iosApp.swift in Sources */ = {isa = PBXBuildFile; fileRef = A93A953A29CC810C00F8E227 /* iosApp.swift */; };
        /* End PBXBuildFile section */

        /* Begin PBXFileReference section */
        		A93A953729CC810C00F8E227 /* Multiplatform App.app */ = {isa = PBXFileReference; explicitFileType = wrapper.application; includeInIndex = 0; path = "Multiplatform App.app"; sourceTree = BUILT_PRODUCTS_DIR; };
        		A93A953A29CC810C00F8E227 /* iosApp.swift */ = {isa = PBXFileReference; lastKnownFileType = sourcecode.swift; path = iosApp.swift; sourceTree = "<group>"; };
        /* End PBXFileReference section */

        /* Begin PBXFrameworksBuildPhase section */
        		A93A953429CC810C00F8E227 /* Frameworks */ = {
        			isa = PBXFrameworksBuildPhase;
        			buildActionMask = 2147483647;
        			files = (
        			);
        			runOnlyForDeploymentPostprocessing = 0;
        		};
        /* End PBXFrameworksBuildPhase section */

        /* Begin PBXGroup section */
        		A93A952E29CC810C00F8E227 = {
        			isa = PBXGroup;
        			children = (
        				A93A953929CC810C00F8E227 /* iosApp */,
        				A93A953829CC810C00F8E227 /* Products */,
        				C4127409AE3703430489E7BC /* Frameworks */,
        			);
        			sourceTree = "<group>";
        		};
        		A93A953829CC810C00F8E227 /* Products */ = {
        			isa = PBXGroup;
        			children = (
        				A93A953729CC810C00F8E227 /* Multiplatform App.app */,
        			);
        			name = Products;
        			sourceTree = "<group>";
        		};
        		A93A953929CC810C00F8E227 /* iosApp */ = {
        			isa = PBXGroup;
        			children = (
        				A93A953A29CC810C00F8E227 /* iosApp.swift */,
        			);
        			path = iosApp;
        			sourceTree = "<group>";
        		};
        		C4127409AE3703430489E7BC /* Frameworks */ = {
        			isa = PBXGroup;
        			children = (
        			);
        			name = Frameworks;
        			sourceTree = "<group>";
        		};
        /* End PBXGroup section */

        /* Begin PBXNativeTarget section */
        		A93A953629CC810C00F8E227 /* iosApp */ = {
        			isa = PBXNativeTarget;
        			buildConfigurationList = A93A954529CC810D00F8E227 /* Build configuration list for PBXNativeTarget "iosApp" */;
        			buildPhases = (
        				A9D80A052AAB5CDE006C8738 /* ShellScript */,
        				A93A953329CC810C00F8E227 /* Sources */,
        				A93A953429CC810C00F8E227 /* Frameworks */,
        			);
        			buildRules = (
        			);
        			dependencies = (
        			);
        			name = iosApp;
        			productName = iosApp;
        			productReference = A93A953729CC810C00F8E227 /* Multiplatform App.app */;
        			productType = "com.apple.product-type.application";
        		};
        /* End PBXNativeTarget section */

        /* Begin PBXProject section */
        		A93A952F29CC810C00F8E227 /* Project object */ = {
        			isa = PBXProject;
        			attributes = {
        				LastSwiftUpdateCheck = 1420;
        				LastUpgradeCheck = 1420;
        				TargetAttributes = {
        					A93A953629CC810C00F8E227 = {
        						CreatedOnToolsVersion = 14.2;
        					};
        				};
        			};
        			buildConfigurationList = A93A953229CC810C00F8E227 /* Build configuration list for PBXProject "iosApp" */;
        			compatibilityVersion = "Xcode 14.0";
        			developmentRegion = en;
        			hasScannedForEncodings = 0;
        			knownRegions = (
        				en,
        				Base,
        			);
        			mainGroup = A93A952E29CC810C00F8E227;
        			productRefGroup = A93A953829CC810C00F8E227 /* Products */;
        			projectDirPath = "";
        			projectRoot = "";
        			targets = (
        				A93A953629CC810C00F8E227 /* iosApp */,
        			);
        		};
        /* End PBXProject section */

        /* Begin PBXShellScriptBuildPhase section */
        		A9D80A052AAB5CDE006C8738 /* ShellScript */ = {
        			isa = PBXShellScriptBuildPhase;
        			buildActionMask = 2147483647;
        			files = (
        			);
        			inputFileListPaths = (
        			);
        			inputPaths = (
        			);
        			outputFileListPaths = (
        			);
        			outputPaths = (
        			);
        			runOnlyForDeploymentPostprocessing = 0;
        			shellPath = /bin/sh;
        			shellScript = "cd \"${'$'}SRCROOT/..\"\n./../gradlew :sample:composeApp:embedAndSignAppleFrameworkForXcode\n";
        		};
        /* End PBXShellScriptBuildPhase section */

        /* Begin PBXSourcesBuildPhase section */
        		A93A953329CC810C00F8E227 /* Sources */ = {
        			isa = PBXSourcesBuildPhase;
        			buildActionMask = 2147483647;
        			files = (
        				A93A953B29CC810C00F8E227 /* iosApp.swift in Sources */,
        			);
        			runOnlyForDeploymentPostprocessing = 0;
        		};
        /* End PBXSourcesBuildPhase section */

        /* Begin XCBuildConfiguration section */
        		A93A954329CC810D00F8E227 /* Debug */ = {
        			isa = XCBuildConfiguration;
        			buildSettings = {
        				ALWAYS_SEARCH_USER_PATHS = NO;
        				CLANG_ANALYZER_NONNULL = YES;
        				CLANG_ANALYZER_NUMBER_OBJECT_CONVERSION = YES_AGGRESSIVE;
        				CLANG_CXX_LANGUAGE_STANDARD = "gnu++20";
        				CLANG_ENABLE_MODULES = YES;
        				CLANG_ENABLE_OBJC_ARC = YES;
        				CLANG_ENABLE_OBJC_WEAK = YES;
        				CLANG_WARN_BLOCK_CAPTURE_AUTORELEASING = YES;
        				CLANG_WARN_BOOL_CONVERSION = YES;
        				CLANG_WARN_COMMA = YES;
        				CLANG_WARN_CONSTANT_CONVERSION = YES;
        				CLANG_WARN_DEPRECATED_OBJC_IMPLEMENTATIONS = YES;
        				CLANG_WARN_DIRECT_OBJC_ISA_USAGE = YES_ERROR;
        				CLANG_WARN_DOCUMENTATION_COMMENTS = YES;
        				CLANG_WARN_EMPTY_BODY = YES;
        				CLANG_WARN_ENUM_CONVERSION = YES;
        				CLANG_WARN_INFINITE_RECURSION = YES;
        				CLANG_WARN_INT_CONVERSION = YES;
        				CLANG_WARN_NON_LITERAL_NULL_CONVERSION = YES;
        				CLANG_WARN_OBJC_IMPLICIT_RETAIN_SELF = YES;
        				CLANG_WARN_OBJC_LITERAL_CONVERSION = YES;
        				CLANG_WARN_OBJC_ROOT_CLASS = YES_ERROR;
        				CLANG_WARN_QUOTED_INCLUDE_IN_FRAMEWORK_HEADER = YES;
        				CLANG_WARN_RANGE_LOOP_ANALYSIS = YES;
        				CLANG_WARN_STRICT_PROTOTYPES = YES;
        				CLANG_WARN_SUSPICIOUS_MOVE = YES;
        				CLANG_WARN_UNGUARDED_AVAILABILITY = YES_AGGRESSIVE;
        				CLANG_WARN_UNREACHABLE_CODE = YES;
        				CLANG_WARN__DUPLICATE_METHOD_MATCH = YES;
        				COPY_PHASE_STRIP = NO;
        				DEBUG_INFORMATION_FORMAT = dwarf;
        				ENABLE_STRICT_OBJC_MSGSEND = YES;
        				ENABLE_TESTABILITY = YES;
        				GCC_C_LANGUAGE_STANDARD = gnu11;
        				GCC_DYNAMIC_NO_PIC = NO;
        				GCC_NO_COMMON_BLOCKS = YES;
        				GCC_OPTIMIZATION_LEVEL = 0;
        				GCC_PREPROCESSOR_DEFINITIONS = (
        					"DEBUG=1",
        					"${'$'}(inherited)",
        				);
        				GCC_WARN_64_TO_32_BIT_CONVERSION = YES;
        				GCC_WARN_ABOUT_RETURN_TYPE = YES_ERROR;
        				GCC_WARN_UNDECLARED_SELECTOR = YES;
        				GCC_WARN_UNINITIALIZED_AUTOS = YES_AGGRESSIVE;
        				GCC_WARN_UNUSED_FUNCTION = YES;
        				GCC_WARN_UNUSED_VARIABLE = YES;
        				IPHONEOS_DEPLOYMENT_TARGET = 16.2;
        				MTL_ENABLE_DEBUG_INFO = INCLUDE_SOURCE;
        				MTL_FAST_MATH = YES;
        				ONLY_ACTIVE_ARCH = YES;
        				SDKROOT = iphoneos;
        				SWIFT_ACTIVE_COMPILATION_CONDITIONS = DEBUG;
        				SWIFT_OPTIMIZATION_LEVEL = "-Onone";
        			};
        			name = Debug;
        		};
        		A93A954429CC810D00F8E227 /* Release */ = {
        			isa = XCBuildConfiguration;
        			buildSettings = {
        				ALWAYS_SEARCH_USER_PATHS = NO;
        				CLANG_ANALYZER_NONNULL = YES;
        				CLANG_ANALYZER_NUMBER_OBJECT_CONVERSION = YES_AGGRESSIVE;
        				CLANG_CXX_LANGUAGE_STANDARD = "gnu++20";
        				CLANG_ENABLE_MODULES = YES;
        				CLANG_ENABLE_OBJC_ARC = YES;
        				CLANG_ENABLE_OBJC_WEAK = YES;
        				CLANG_WARN_BLOCK_CAPTURE_AUTORELEASING = YES;
        				CLANG_WARN_BOOL_CONVERSION = YES;
        				CLANG_WARN_COMMA = YES;
        				CLANG_WARN_CONSTANT_CONVERSION = YES;
        				CLANG_WARN_DEPRECATED_OBJC_IMPLEMENTATIONS = YES;
        				CLANG_WARN_DIRECT_OBJC_ISA_USAGE = YES_ERROR;
        				CLANG_WARN_DOCUMENTATION_COMMENTS = YES;
        				CLANG_WARN_EMPTY_BODY = YES;
        				CLANG_WARN_ENUM_CONVERSION = YES;
        				CLANG_WARN_INFINITE_RECURSION = YES;
        				CLANG_WARN_INT_CONVERSION = YES;
        				CLANG_WARN_NON_LITERAL_NULL_CONVERSION = YES;
        				CLANG_WARN_OBJC_IMPLICIT_RETAIN_SELF = YES;
        				CLANG_WARN_OBJC_LITERAL_CONVERSION = YES;
        				CLANG_WARN_OBJC_ROOT_CLASS = YES_ERROR;
        				CLANG_WARN_QUOTED_INCLUDE_IN_FRAMEWORK_HEADER = YES;
        				CLANG_WARN_RANGE_LOOP_ANALYSIS = YES;
        				CLANG_WARN_STRICT_PROTOTYPES = YES;
        				CLANG_WARN_SUSPICIOUS_MOVE = YES;
        				CLANG_WARN_UNGUARDED_AVAILABILITY = YES_AGGRESSIVE;
        				CLANG_WARN_UNREACHABLE_CODE = YES;
        				CLANG_WARN__DUPLICATE_METHOD_MATCH = YES;
        				COPY_PHASE_STRIP = NO;
        				DEBUG_INFORMATION_FORMAT = "dwarf-with-dsym";
        				ENABLE_NS_ASSERTIONS = NO;
        				ENABLE_STRICT_OBJC_MSGSEND = YES;
        				GCC_C_LANGUAGE_STANDARD = gnu11;
        				GCC_NO_COMMON_BLOCKS = YES;
        				GCC_WARN_64_TO_32_BIT_CONVERSION = YES;
        				GCC_WARN_ABOUT_RETURN_TYPE = YES_ERROR;
        				GCC_WARN_UNDECLARED_SELECTOR = YES;
        				GCC_WARN_UNINITIALIZED_AUTOS = YES_AGGRESSIVE;
        				GCC_WARN_UNUSED_FUNCTION = YES;
        				GCC_WARN_UNUSED_VARIABLE = YES;
        				IPHONEOS_DEPLOYMENT_TARGET = 16.2;
        				MTL_ENABLE_DEBUG_INFO = NO;
        				MTL_FAST_MATH = YES;
        				SDKROOT = iphoneos;
        				SWIFT_COMPILATION_MODE = wholemodule;
        				SWIFT_OPTIMIZATION_LEVEL = "-O";
        				VALIDATE_PRODUCT = YES;
        			};
        			name = Release;
        		};
        		A93A954629CC810D00F8E227 /* Debug */ = {
        			isa = XCBuildConfiguration;
        			buildSettings = {
        				CODE_SIGN_STYLE = Automatic;
        				CURRENT_PROJECT_VERSION = 1;
        				ENABLE_PREVIEWS = YES;
        				GENERATE_INFOPLIST_FILE = YES;
        				INFOPLIST_FILE = iosApp/Info.plist;
        				INFOPLIST_KEY_UILaunchScreen_Generation = YES;
        				LD_RUNPATH_SEARCH_PATHS = (
        					"${'$'}(inherited)",
        					"@executable_path/Frameworks",
        				);
        				MARKETING_VERSION = 1.0;
        				PRODUCT_BUNDLE_IDENTIFIER = sample.app.iosApp;
        				PRODUCT_NAME = "Multiplatform App";
        				SWIFT_EMIT_LOC_STRINGS = YES;
        				SWIFT_VERSION = 5.0;
        				TARGETED_DEVICE_FAMILY = "1,2";
        			};
        			name = Debug;
        		};
        		A93A954729CC810D00F8E227 /* Release */ = {
        			isa = XCBuildConfiguration;
        			buildSettings = {
        				CODE_SIGN_STYLE = Automatic;
        				CURRENT_PROJECT_VERSION = 1;
        				ENABLE_PREVIEWS = YES;
        				GENERATE_INFOPLIST_FILE = YES;
        				INFOPLIST_FILE = iosApp/Info.plist;
        				INFOPLIST_KEY_UILaunchScreen_Generation = YES;
        				LD_RUNPATH_SEARCH_PATHS = (
        					"${'$'}(inherited)",
        					"@executable_path/Frameworks",
        				);
        				MARKETING_VERSION = 1.0;
        				PRODUCT_BUNDLE_IDENTIFIER = sample.app.iosApp;
        				PRODUCT_NAME = "Multiplatform App";
        				SWIFT_EMIT_LOC_STRINGS = YES;
        				SWIFT_VERSION = 5.0;
        				TARGETED_DEVICE_FAMILY = "1,2";
        			};
        			name = Release;
        		};
        /* End XCBuildConfiguration section */

        /* Begin XCConfigurationList section */
        		A93A953229CC810C00F8E227 /* Build configuration list for PBXProject "iosApp" */ = {
        			isa = XCConfigurationList;
        			buildConfigurations = (
        				A93A954329CC810D00F8E227 /* Debug */,
        				A93A954429CC810D00F8E227 /* Release */,
        			);
        			defaultConfigurationIsVisible = 0;
        			defaultConfigurationName = Release;
        		};
        		A93A954529CC810D00F8E227 /* Build configuration list for PBXNativeTarget "iosApp" */ = {
        			isa = XCConfigurationList;
        			buildConfigurations = (
        				A93A954629CC810D00F8E227 /* Debug */,
        				A93A954729CC810D00F8E227 /* Release */,
        			);
        			defaultConfigurationIsVisible = 0;
        			defaultConfigurationName = Release;
        		};
        /* End XCConfigurationList section */
        	};
        	rootObject = A93A952F29CC810C00F8E227 /* Project object */;
        }
    """.trimIndent()
}