# Library Management System

## Repository structure

- `generate_docx.py` - Python script that generates assignment reports.
- `CLI/` - Java CLI application source files.
- `GUI/` - Java GUI application source files.
- `common/` - Shared Java classes used by both CLI and GUI versions.
- `data/` - Input/output text data used by the applications.
- `build/` - Generated output files (ignored by Git).

## Git upload guidance

1. Keep source files and project folders (`CLI/`, `GUI/`, `common/`, `data/`, `generate_docx.py`).
2. Do not commit `build/` or generated `.docx`/`.jar` files.
3. Use `.gitignore` to prevent generated artifacts from being tracked.

## Generating reports

Run:

```bash
python generate_docx.py
```

Generated reports are saved to `build/`.
